package com.gijosc.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gijosc.adoteumpet.core.exceptions.PetNotFoundException;
import com.gijosc.adoteumpet.core.models.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

    default Pet findByIdOrElseThrow(Long id) {
        return findById(id)
                            .orElseThrow(PetNotFoundException::new);       
    }  
}
