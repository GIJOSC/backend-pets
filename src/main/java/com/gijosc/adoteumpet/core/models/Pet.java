package com.gijosc.adoteumpet.core.models;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded =  true)
public class Pet {

 @EqualsAndHashCode.Include
  private Long id;

  private String nome;

  private String historia;

  private String foto;



}
