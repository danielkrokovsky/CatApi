package br.com.cast.castApi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.cast.castApi.ferias.model.FeriasEventHandler;

@Configuration
public class RepositoryConfiguration{
     
    public RepositoryConfiguration(){
        super();
    }
 
    @Bean
    FeriasEventHandler feriasEventHandler() {
        return new FeriasEventHandler();
    }
 
}