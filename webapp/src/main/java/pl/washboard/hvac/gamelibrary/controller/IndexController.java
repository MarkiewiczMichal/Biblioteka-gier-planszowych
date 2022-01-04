package pl.washboard.hvac.gamelibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {


    @GetMapping("nologin")
    public String noLoginPage(Model model) {
        return "nologin";
    }

    @GetMapping("hello")
    public String sayHello(Model model) {
        return "hello";
    }

    @GetMapping("auth/userinfo")
    public String userInformation(Model model) {
        return "aboutUserInfo";
    }
}
