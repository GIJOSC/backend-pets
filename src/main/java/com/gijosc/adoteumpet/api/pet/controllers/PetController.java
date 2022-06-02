package com.gijosc.adoteumpet.api.pet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gijosc.adoteumpet.core.models.Pet;
import com.gijosc.adoteumpet.core.repositories.PetRepositories;

@RestController
public class PetController {

  @Autowired  
  private PetRepositories petRepository;

  @GetMapping("/pets")  
  public List<Pet> findAll() {
      return petRepository.findAll();
      
    }
  
}
