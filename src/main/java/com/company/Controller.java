package com.company;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable("name") String name) throws NumberParseException {


        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();

        //      try {
        Phonenumber.PhoneNumber swissNumberProto = phoneUtil.parse(name, "PL");
//        } catch (NumberParseException e) {
//            System.err.println("NumberParseException was thrown: " + e.toString());
//        }
        return phoneUtil.format(swissNumberProto, PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
    }
}
