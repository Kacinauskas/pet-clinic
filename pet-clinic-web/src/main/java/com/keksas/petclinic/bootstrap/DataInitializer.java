package com.keksas.petclinic.bootstrap;

import com.keksas.petclinic.model.Owner;
import com.keksas.petclinic.model.Vet;
import com.keksas.petclinic.services.OwnerService;
import com.keksas.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataInitializer(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args)  {
        ownerService.save(new Owner(1L, "John", "Snow"));
        ownerService.save(new Owner(2L, "John", "Snow"));

        System.out.println("Loading Owners ...");

        vetService.save(new Vet(1L, "Alex", "Axe"));
        vetService.save(new Vet(2L, "Sam", "Space"));

        System.out.println("Loading Vets...");
    }

}
