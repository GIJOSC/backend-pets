package com.gijosc.adoteumpet.api.pet.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gijosc.adoteumpet.api.pet.dtos.PetResponse;
import com.gijosc.adoteumpet.api.pet.mappers.PetMapper;
import com.gijosc.adoteumpet.core.models.Pet;
import com.gijosc.adoteumpet.core.repositories.PetRepository;

@RestController
public class PetController {

  @Autowired  
  private PetRepository petRepository;

  @Autowired
  private PetMapper petMapper;

  @GetMapping("/pets")  
  public List<PetResponse> findAll() {
      var pets = petRepository.findAll();
      var PetResponses = new ArrayList<PetResponse>();
      for (Pet pet : pets) {
        PetResponses.add(petMapper.toResponse(pet));        
      }
      return PetResponses;
      
    }
  
}
