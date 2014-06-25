package io.pallas.coreexample.conrtollers;

import io.pallas.core.annotations.Controller;
import io.pallas.core.annotations.DefaultAction;

@Controller
public class IndexController {

    @DefaultAction
    public String def() {
        return "Some template";
    }

    public String index() {

        return "Hello";
    }

}
