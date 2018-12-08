package hello.controllers;

import hello.repositories.ClientRepository;
import hello.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientRestController {

    @Autowired
    ClientService clientService;

    @ResponseBody
    @RequestMapping(value = "/client", method = RequestMethod.GET, produces = "application/json")
    public Object getClients() {
        return clientService.getClients();
    }

}
