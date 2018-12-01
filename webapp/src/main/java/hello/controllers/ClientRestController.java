package hello.controllers;

import hello.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ClientRestController {

    @Autowired
    ClientService clientService;

    @ResponseBody
    @RequestMapping(value = "/api/client", method = RequestMethod.GET, produces = "application/json")
    public Object getClients() {
        return clientService.getClients();
    }

    @ResponseBody
    @RequestMapping(value = "/api/package", method = RequestMethod.GET, produces = "application/json")
    public Object getParcels(HttpServletRequest request) {
        String token = request.getHeader("token");
        return clientService.getParcelsForClient(token);
    }

}
