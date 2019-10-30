package com.keksas.petclinic.bootstrap;

import com.keksas.petclinic.model.Owner;
import com.keksas.petclinic.model.Vet;
import com.keksas.petclinic.services.OwnerService;
import com.keksas.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final OwnerService ownerMapService;
    private final VetService vetMapService;

    public DataInitializer(OwnerService ownerMapService, VetService vetMapService) {
        this.ownerMapService = ownerMapService;
        this.vetMapService = vetMapService;
    }

    @Override
    public void run(String... args) {
        ownerMapService.save(new Owner(1L, "John", "Snow"));
        ownerMapService.save(new Owner(2L, "John", "Snow"));

        System.out.println("Loading Owners ...");

        vetMapService.save(new Vet(1L, "Alex", "Axe"));
        vetMapService.save(new Vet(2L, "Sam", "Space"));

        System.out.println("Loading Vets...");
    }

}
