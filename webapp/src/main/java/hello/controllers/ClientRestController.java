package hello.controllers;

import hello.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    @RequestMapping(value = "/api/package/{token}", method = RequestMethod.GET, produces = "application/json")
    public Object getParcels(HttpServletRequest request, @PathVariable(name="token") String token) {
//        String token = request.getHeader("token");
        return clientService.getParcelsForClient(token);
    }

}
