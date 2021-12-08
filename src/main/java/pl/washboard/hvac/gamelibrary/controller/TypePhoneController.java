package pl.washboard.hvac.gamelibrary.controller;

import com.google.i18n.phonenumbers.PhoneNumberUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pl.washboard.hvac.libutil.PhoneFormater;

@RestController
public class TypePhoneController {

    private final static PhoneFormater HELPER = new PhoneFormater();

    @GetMapping("type/{phonenumber}")
    public PhoneNumberUtil.PhoneNumberType getType(@PathVariable("phonenumber") String phonenumber) {
        return HELPER.getType(phonenumber);
    }
}
