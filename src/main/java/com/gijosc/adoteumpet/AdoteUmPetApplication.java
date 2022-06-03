package com.gijosc.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gijosc.adoteumpet.core.models.Pet;
import com.gijosc.adoteumpet.core.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetApplication implements CommandLineRunner {

	@Autowired
	private PetRepository petRepository;

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var pet = new Pet();
		pet.setNome("Joãozinho");
		pet.setHistoria("Historioa de sucesso");
		pet.setFoto(
				"http://www.google.com");
		petRepository.save(pet);
	}
}
