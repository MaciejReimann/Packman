package hello.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String main(Model model) {
        return "index";
    }

    @RequestMapping("/client")
    public String client(Model model) {
        return "client/index";
    }

    @RequestMapping("/parcel")
    public String parcel(Model model) {
        return "parcel/index";
    }
}
