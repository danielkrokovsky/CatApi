package br.com.cast.castApi.ferias.model;

import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.data.rest.core.annotation.HandleAfterDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeDelete;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.data.rest.core.event.AbstractRepositoryEventListener;
import org.springframework.stereotype.Component;

@RepositoryEventHandler(Ferias.class) 
public class FeriasEventHandler extends AbstractRepositoryEventListener<Ferias> {
	
	@HandleBeforeCreate(Ferias.class)
	@HandleAfterCreate(Ferias.class)
	@HandleBeforeDelete(Ferias.class)
	@HandleAfterDelete(Ferias.class)
	@HandleBeforeSave(Ferias.class)
    private void handleBeforeSave(Ferias object) { 
		
		System.out.println(object);
		
	}
	
}


