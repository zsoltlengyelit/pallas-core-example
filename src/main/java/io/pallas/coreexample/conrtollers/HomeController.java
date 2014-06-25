package io.pallas.coreexample.conrtollers;

import io.pallas.core.annotations.Controller;

@Controller("home")
public class HomeController {

    public String index() {

        throw new RuntimeException();

    }

}
