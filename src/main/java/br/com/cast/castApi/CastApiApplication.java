package br.com.cast.castApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CastApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CastApiApplication.class, args);

	}
	
	@Bean
    public RepositoryConfiguration getAppName() {

        return new RepositoryConfiguration();
    }
	
}
