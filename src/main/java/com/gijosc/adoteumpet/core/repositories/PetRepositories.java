package com.gijosc.adoteumpet.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gijosc.adoteumpet.core.models.Pet;

public interface PetRepositories extends JpaRepository<Pet, Long> {
  
}
