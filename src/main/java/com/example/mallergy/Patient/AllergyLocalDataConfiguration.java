package com.example.mallergy.Patient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AllergyLocalDataConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(AllergyRepository allergyRepository) {
        return args -> {
            AllergyModel skinRashes = new AllergyModel(
                    "Skin rashes",
                   "develop skin rashes when I touch fresh fish."
            );
            AllergyModel burns = new AllergyModel(
                    "Burns",
                    "A little amount of heat causes skin burn."
            );
            AllergyModel cough = new AllergyModel(
                    "Severe cough",
                    "Dust makes me cough so hard."
            );
            AllergyModel spit = new AllergyModel(
                    "Difficult breathing",
                    "Deodorants and perfumes disturb my breathing"
            );
            AllergyModel pimples = new AllergyModel(
                    "Pimples",
                    "Some specific pomades cause pimples when I use them."
            );

            allergyRepository.saveAll(List.of(skinRashes, burns, cough, spit, pimples));
        };
    }
}
