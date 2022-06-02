package com.gijosc.adoteumpet.core.repositories;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gijosc.adoteumpet.core.models.Pet;

public interface PetRepositories extends JpaRepository<Pet, Long> {

    default Pet findByIdOrElseThrow(Long id) {
        var petOptional = findById(id);
        if (petOptional.isPresent()) {
            return petOptional.get();
        } 
          throw new EntityNotFoundException("Pet não encontrado");        
    }  
}
