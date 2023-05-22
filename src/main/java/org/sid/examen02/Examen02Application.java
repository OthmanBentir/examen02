package org.sid.examen02;

import org.sid.examen02.entities.Infraction;
import org.sid.examen02.repositories.InfractionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Examen02Application {

    public static void main(String[] args) {

        SpringApplication.run(Examen02Application.class, args);
    }

    @Bean
    CommandLineRunner start(InfractionRepository infractionRepository){
        return args -> {
            Infraction infraction = Infraction.builder()
                    .date(new Date())
                    .idRadar(12)
                    .numeroMatriculeVehicule("123456")
                    .vitesseVoiture(128)
                    .vitesseMaximalRadar(120)
                    .montantInfraction(500)
                    .build();
            infractionRepository.save(infraction);
        };
    }

}
