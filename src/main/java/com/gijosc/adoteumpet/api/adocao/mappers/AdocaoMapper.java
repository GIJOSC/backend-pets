package com.gijosc.adoteumpet.api.adocao.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gijosc.adoteumpet.api.adocao.dtos.AdocaoRequest;
import com.gijosc.adoteumpet.api.adocao.dtos.AdocaoResponse;
import com.gijosc.adoteumpet.api.pet.controllers.petRepository;
import com.gijosc.adoteumpet.api.pet.mappers.PetMapper;
import com.gijosc.adoteumpet.core.models.Adocao;
import com.gijosc.adoteumpet.core.repositories.PetRepositories;

@Component
public class AdocaoMapper {

 @Autowired
  private PetRepositories petRepositories;

  @Autowired
  private PetMapper petMapper;

  public Adocao toModel (AdocaoRequest adocaoRequest) {
      var adocao = new Adocao();
      adocao.setEmail(adocaoRequest.getEmail());
      adocao.setValor(adocaoRequest.getValor());
      adocao.setPet(petRepositories.findByIdOrElseThrow(adocaoRequest.getPetId()));
      return adocao;
  }

  public AdocaoResponse toResponse(Adocao adocao) {
      var adocaoResponse = new AdocaoResponse();
      adocaoResponse.setId(adocao.getId());
      adocaoResponse.setEmail(adocao.getEmail());
      adocaoResponse.setValor(adocao.getValor());
      adocaoResponse.setPet(petMapper.toResponse(adocao.getPet()));
      return adocaoResponse;
  }
  
}
