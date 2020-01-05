package com.keksas.petclinic.controllers;

import com.keksas.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping(value = "/owners")
    public String owners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
