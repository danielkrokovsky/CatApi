package br.com.cast.castApi.funcionario.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.cast.castApi.funcionario.model.Funcionario;
import br.com.cast.castApi.funcionario.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	
	public Iterable<Funcionario> funcionariosPodemTirarFerias() {
		
		
		Iterable<Funcionario> i = funcionarioRepository.funcionariosPodemTirarFerias();
		
		return i;
	}


	public Funcionario save(Funcionario funcionario) {
		
		return funcionarioRepository.save(funcionario);
		 
	}
	 
}
