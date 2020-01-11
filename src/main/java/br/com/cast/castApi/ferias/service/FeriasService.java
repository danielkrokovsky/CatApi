package br.com.cast.castApi.ferias.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.castApi.equipe.model.Equipe;
import br.com.cast.castApi.equipe.repository.EquipeRepository;
import br.com.cast.castApi.ferias.model.Ferias;
import br.com.cast.castApi.ferias.repository.FeriasRepository;

@Service
public class FeriasService {

	@Autowired
	private FeriasRepository feriasRepository;
	
	@Autowired
	private EquipeRepository equipeRepository;
	
	
	public void cadastrarFerias(Ferias ferias) {
		
		validacao(ferias.getFuncionario().getEquipe());
		feriasRepository.save(ferias);
	}
	
	
	public Iterable<Ferias> consultarFerias() {
		
		return feriasRepository.findAll();
	}


	public Ferias listFuncionariosSolicitacaoFerias(String matricula) {
		
		return feriasRepository.buscarFeriasPorMatriculaFuncionario(matricula);
	}
	
	private void validacao(Equipe equipe) {
		
		Equipe eqp = equipeRepository.buscarEquipePorId(equipe.getId());
		
		if(eqp.getFuncionario().size() <= 4) {
			
			/*Ferias ferias = this.feriasRepository.buscarFeriasAtivaPorEquipe(equipe.getId());
			System.out.println(ferias);*/
		}
	}
}
