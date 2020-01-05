package com.keksas.petclinic.controllers;

import com.keksas.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/vets")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @GetMapping()
    public String vets(Model model) {
        model.addAttribute("vets", vetService.findAll());
        return "vets/index";
    }
}
