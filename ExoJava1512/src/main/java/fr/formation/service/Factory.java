package fr.formation.service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import fr.formation.model.*;

@Configuration
public class Factory {

	@Bean
	public Voiture VoitureFactory() {
		return new Voiture("Blanc",1500);
	}
}
