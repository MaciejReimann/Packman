package hello.controllers;

import hello.domain.ParcelDto;
import hello.model.Client;
import hello.model.Parcel;
import hello.repositories.ClientRepository;
import hello.repositories.ParcelRepository;
import hello.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ParcelRestController {


    @Autowired
    ParcelRepository parcelRepository;

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    EmailService emailService;

    @RequestMapping(value = "/api/parcel/delivered", method = RequestMethod.POST, consumes = "application/json")
    public void setDelivered(@RequestBody ParcelDto parcelDto, HttpServletResponse response) {
        Parcel parcel = parcelRepository.findOne(parcelDto.getId());
        if (parcel == null) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
        } else {
            parcel.setStatus("delivered");
            parcel.setEta("0");
            parcelRepository.save(parcel);
        }
    }

    @RequestMapping(value = "/api/parcel/updateEta", method = RequestMethod.POST, consumes = "application/json")
    public void changeETA(@RequestBody ParcelDto parcelDto, HttpServletResponse response) {
        Parcel parcel = parcelRepository.findOne(parcelDto.getId());
        if (parcel == null || StringUtils.isEmpty(parcel.getEta())) {
            response.setStatus(HttpStatus.BAD_REQUEST.value());
        } else { ;
            parcel.setEta(parcelDto.getEta());
            parcelRepository.save(parcel);
        }
        emailService.sendSimpleMessage(parcel.getClient().getEmail(), "Parcel no "+ parcel.getParcelNo() + " will sooon at your doorstep!", "Parcel " + parcel.getParcelNo()  +" will be at your doorstep in " + parcel.getEta() + " minutes.");
    }
}
