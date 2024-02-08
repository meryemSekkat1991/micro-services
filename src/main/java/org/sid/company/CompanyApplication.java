package org.sid.company;

import org.sid.company.dao.EntrepriseRepository;
import org.sid.company.entities.Entreprise;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CompanyApplication {
  public static void main(String[] args) {
    SpringApplication.run(CompanyApplication.class, args);
  }

  //@Override
 // public void run(String... args) throws Exception {
  //}

  @Bean
  CommandLineRunner start(EntrepriseRepository entrepriseRepository) {
    return args -> {
      Stream.of("A", "B", "C").forEach( cn -> {
        entrepriseRepository.save(new Entreprise(null, cn, 100+Math.random()*900));

        entrepriseRepository.findAll().forEach( s -> {
          System.out.println(s.toString());
        });

        entrepriseRepository.findAll().forEach(System.out::println);

      });
    };
  }
}
