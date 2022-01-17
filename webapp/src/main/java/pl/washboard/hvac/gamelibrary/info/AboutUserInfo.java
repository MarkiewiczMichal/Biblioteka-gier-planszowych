package pl.washboard.hvac.gamelibrary.info;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AboutUserInfo {
    private String name;
    private boolean logged;

    public AboutUserInfo(String name, boolean isLogged) {
        this.name = name;
        this.logged = isLogged;
    }

    public String getName() {
        return name;
    }

    @JsonProperty("isLogged")
    public boolean isLogged() {
        return logged;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogged(boolean logged) {
        this.logged = logged;
    }
}
