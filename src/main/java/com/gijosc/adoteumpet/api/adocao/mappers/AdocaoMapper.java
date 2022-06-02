package com.gijosc.adoteumpet.api.adocao.mappers;

import org.springframework.stereotype.Component;

import com.gijosc.adoteumpet.api.adocao.dtos.AdocaoRequest;
import com.gijosc.adoteumpet.api.pet.controllers.petRepository;
import com.gijosc.adoteumpet.core.models.Adocao;
import com.gijosc.adoteumpet.core.repositories.PetRepositories;

@Component
public class AdocaoMapper {

  private PetRepositories petRepositories;

  public Adocao toModel (AdocaoRequest adocaoRequest) {
      var adocao = new Adocao();
      adocao.setEmail(adocaoRequest.getEmail());
      adocao.setValor(adocaoRequest.getValor());
      adocao.setPet(petRepositories.findByIdOrElseThrow(adocaoRequest.getPetId()));
      return adocao;
  }
  
}
