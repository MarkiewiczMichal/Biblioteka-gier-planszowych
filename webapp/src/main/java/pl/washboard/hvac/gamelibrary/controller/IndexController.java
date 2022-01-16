package pl.washboard.hvac.gamelibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
