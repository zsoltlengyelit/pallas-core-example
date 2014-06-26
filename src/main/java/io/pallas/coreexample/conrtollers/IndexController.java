package io.pallas.coreexample.conrtollers;

import io.pallas.core.annotations.Controller;
import io.pallas.core.annotations.DefaultAction;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.QueryParam;

@Controller
public class IndexController {

    @Inject
    private HttpServletRequest request;

    @DefaultAction
    public String def(@QueryParam("name") Long name) {

        return "Some template: " + name;
    }

    public String index() {

        return "Hello";
    }

}
