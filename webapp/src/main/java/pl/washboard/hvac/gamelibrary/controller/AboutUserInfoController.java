package pl.washboard.hvac.gamelibrary.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.washboard.hvac.gamelibrary.info.AboutUserInfo;

@RestController
class AboutUserInfoController {

    @GetMapping("/auth/userinfo")
    public AboutUserInfo someInfoAboutUser(Authentication auth) throws JsonProcessingException {
        if (auth == null || !auth.isAuthenticated()) {
            return new AboutUserInfo("anonymous", false);
        } else {
            return new AboutUserInfo(auth.getName(), auth.isAuthenticated());
        }
    }
}


