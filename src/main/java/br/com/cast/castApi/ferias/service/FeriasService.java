package br.com.cast.castApi.ferias.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.castApi.ferias.model.Ferias;
import br.com.cast.castApi.ferias.repository.FeriasRepository;

@Service
public class FeriasService {

	@Autowired
	private FeriasRepository feriasRepository;
	
	
	public void cadastrarFerias(Ferias ferias) {
		
		feriasRepository.save(ferias);
	}
	
	
	public Iterable<Ferias> consultarFerias() {
		
		return feriasRepository.findAll();
	}


	public Ferias listFuncionariosSolicitacaoFerias(String matricula) {
		
		return feriasRepository.buscarFeriasPorMatriculaFuncionario(matricula);
	}
}
