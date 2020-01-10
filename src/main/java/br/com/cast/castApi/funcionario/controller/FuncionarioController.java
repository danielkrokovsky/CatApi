package br.com.cast.castApi.funcionario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.castApi.funcionario.model.Funcionario;
import br.com.cast.castApi.funcionario.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;

	@GetMapping
	public Iterable<Funcionario> funcionariosPodemTirarFerias() {
		
		return null;//funcionarioService.funcionariosPodemTirarFerias();
	}
}
