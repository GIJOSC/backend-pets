package com.gijosc.adoteumpet.core.exceptions;

import javax.persistence.EntityNotFoundException;

public class PetNotFoundException extends EntityNotFoundException{

  public PetNotFoundException() {
    super("Pet não Encontrado");
  }

  public PetNotFoundException(String message) {
    super(message);
  }

  
  
}
