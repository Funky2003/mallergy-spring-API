package com.example.mallergy.Patient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AllergyLocalDataConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(AllergyRepository allergyRepository) {
        return args -> {
            AllergyModel skinRashes = new AllergyModel(
                    "Skin rashes",
                   "develop skin rashes when I touch fresh fish."
            );

            allergyRepository.save(skinRashes);
        };
    }
}
