package br.com.cast.castApi.ferias.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.castApi.ferias.model.Ferias;
import br.com.cast.castApi.ferias.service.FeriasService;

@RestController
@RequestMapping("/ferias")
public class FeriasController {
	
	@Autowired
	private FeriasService feriasService;
	
	@PostMapping(path = "/cadastroferias")
	public void CadastroFerias(@Valid @RequestBody Ferias ferias, HttpServletRequest request) {
		
		feriasService.cadastrarFerias(ferias);
	}
	
	
	@GetMapping
	public Iterable<Ferias> CadastroFerias() {
		
		return feriasService.consultarFerias();
	}
	
	
	@GetMapping("/{matricula}")
	public ResponseEntity<Ferias> listFuncionarios(@PathVariable String matricula) {
		
		Ferias ferias = feriasService.listFuncionariosSolicitacaoFerias(matricula);
		
		return ResponseEntity.ok(ferias);
	}

}
