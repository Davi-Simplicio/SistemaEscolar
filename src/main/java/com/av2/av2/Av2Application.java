package com.av2.av2;

import com.av2.av2.controller.SecretarioController;
import com.av2.av2.model.Secretario;
import com.av2.av2.repository.SecretarioRepository;
import com.av2.av2.service.SecretarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Av2Application {

	public static void main(String[] args) {
		SpringApplication.run(Av2Application.class, args);
	}

}
