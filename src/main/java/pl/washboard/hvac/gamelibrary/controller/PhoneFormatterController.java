package pl.washboard.hvac.gamelibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.washboard.hvac.libutil.PhoneFormater;

@RestController
public class PhoneFormatterController {

    private final static PhoneFormater HELPER = new PhoneFormater();

    @GetMapping("format/national/{phoneNumber}")
    public String national(@PathVariable("phoneNumber") String phonenumber) {
        return HELPER.national(phonenumber);
    }

    @GetMapping("format/international/{phoneNumber}")
    public String international(@PathVariable("phoneNumber") String phonenumber) {
        return HELPER.international(phonenumber);
    }
}
