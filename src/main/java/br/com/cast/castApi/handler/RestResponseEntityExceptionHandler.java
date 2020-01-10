package br.com.cast.castApi.handler;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import br.com.cast.castApi.MessageError;
import br.com.cast.castApi.ferias.exception.NaoPodeTirarFeriasException;

@ControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RestResponseEntityExceptionHandler {

		@ExceptionHandler(value = {NaoPodeTirarFeriasException.class})
		protected ResponseEntity<Object> handlelicensePlate(NaoPodeTirarFeriasException ex, WebRequest request) {
		
			//String msg = env.getProperty("msg.car.plate.exception");
			
			MessageError error = new MessageError("Funcionário com menos de 1 ano não pode tirar férias", HttpStatus.CONFLICT.value());
			
			return new ResponseEntity<Object>(error, null,HttpStatus.OK);
		}
}
