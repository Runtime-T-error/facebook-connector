package org.raf.hackaton.facebook;

import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class Configuration {

    public String getToken() {
        return Optional.ofNullable(System.getProperty("facebook.page.token"))
                .orElse("");
    }

}
