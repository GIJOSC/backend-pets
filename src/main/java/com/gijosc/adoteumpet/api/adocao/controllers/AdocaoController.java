package com.gijosc.adoteumpet.api.adocao.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gijosc.adoteumpet.api.adocao.dtos.AdocaoRequest;
import com.gijosc.adoteumpet.api.adocao.dtos.AdocaoResponse;
import com.gijosc.adoteumpet.api.adocao.mappers.AdocaoMapper;
import com.gijosc.adoteumpet.core.repositories.AdocaoRepositories;

@RestController
public class AdocaoController {

  @Autowired
  private AdocaoRepositories adocaoRepositories;

  @Autowired
  private AdocaoMapper adocaoMapper;

 @PostMapping("/adocoes")
 @ResponseStatus(code = HttpStatus.CREATED)
  public AdocaoResponse create( @RequestBody AdocaoRequest adocaoRequest) {
      var adocao = adocaoMapper.toModel(adocaoRequest);
      var createdAdocao = adocaoRepositories.save(adocao);
      return adocaoMapper.toResponse(createdAdocao);
   }  
}
