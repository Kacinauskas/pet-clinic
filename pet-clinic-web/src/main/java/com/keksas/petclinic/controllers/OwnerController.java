package com.keksas.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

    @GetMapping(value = "/owners")
    public String owners() {
        return "owners/index";
    }
}
