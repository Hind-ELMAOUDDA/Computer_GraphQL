package org.example.devoirsurveillecomputer;

import org.example.devoirsurveillecomputer.dto.ComputerDto;
import org.example.devoirsurveillecomputer.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DevoirSurveilleComputerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevoirSurveilleComputerApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ComputerService computerService){
		return  args -> {
			computerService.saveComputer(ComputerDto.builder().proce("Intel Core i5").ram("32GB").hardDrive("512GB SSD").price(30000).build());
			computerService.saveComputer(ComputerDto.builder().proce("Intel Core i6").ram("32GB").hardDrive("512GB SSD").price(50000).build());
			computerService.saveComputer(ComputerDto.builder().proce("Intel Core i7").ram("32GB").hardDrive("512GB SSD").price(90000).build());
			computerService.saveComputer(ComputerDto.builder().proce("Intel Core i9").ram("64GB").hardDrive("512GB SSD").price(100000).build());
		};
	}

}
