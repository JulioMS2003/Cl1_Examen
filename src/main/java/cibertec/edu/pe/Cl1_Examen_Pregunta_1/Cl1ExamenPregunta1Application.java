package cibertec.edu.pe.Cl1_Examen_Pregunta_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Cl1ExamenPregunta1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cl1ExamenPregunta1Application.class, args);
	}

}
