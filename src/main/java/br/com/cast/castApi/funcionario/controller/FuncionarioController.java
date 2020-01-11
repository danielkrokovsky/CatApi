package br.com.cast.castApi.funcionario.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.mail.iap.Response;

import br.com.cast.castApi.ferias.model.Ferias;
import br.com.cast.castApi.funcionario.model.Funcionario;
import br.com.cast.castApi.funcionario.service.FuncionarioService;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;

	@GetMapping
	public Iterable<Funcionario> funcionariosPodemTirarFerias() {
		
		return funcionarioService.funcionariosPodemTirarFerias();
	}
	
	
	@PostMapping
	public ResponseEntity<Funcionario> cadastrarFuncionario(@Valid @RequestBody Funcionario funcionario, HttpServletRequest request) {
		
		return ResponseEntity.ok(funcionarioService.save(funcionario));
	}
}
