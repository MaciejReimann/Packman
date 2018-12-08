package hello.controllers;

import hello.domain.ClientDto;
import hello.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @Autowired
    ClientRepository clientRepository;

    @RequestMapping("/")
    public String main(Model model) {
        return "index";
    }

    @RequestMapping("/client")
    public String client(Model model) {
        return "client/index";
    }

    @RequestMapping(value = "/client/new", method = RequestMethod.GET)
    public String newClientForm(Model model) {
        ClientDto client = new ClientDto();
        model.addAttribute("client", client);
        return "client/form";
    }

    @RequestMapping(value = "/client/new", method = RequestMethod.POST)
    public String newClientSave(@ModelAttribute(name = "client") ClientDto clientDto ) {
        clientRepository.save(clientDto.mapToEntity());
        return "redirect:/client";
    }

    @RequestMapping("/parcel")
    public String parcel(Model model) {
        return "parcel/index";
    }
}
