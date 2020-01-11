package br.com.cast.castApi.ferias.repository;

import java.util.Iterator;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.cast.castApi.ferias.model.Ferias;

@RepositoryRestResource(collectionResourceRel = "feria", path = "feria")
public interface FeriasRepository extends PagingAndSortingRepository<Ferias, Long> {

	@Query("SELECT u FROM Ferias u WHERE u.funcionario.matricula = ?1")
	public Ferias buscarFeriasPorMatriculaFuncionario(String matricula);
	
	
	@Query("SELECT FE FROM Ferias FE JOIN Funcionario FU ON FE.funcionario.id = FU.id "
		 + "JOIN Equipe EQ ON EQ.id = FU.equipe.id WHERE CURRENT_TIMESTAMP() BETWEEN "
		 + "FE.dtInicio AND FE.dtFim AND EQ.id = ?1")
	public Ferias buscarFeriasAtivaPorEquipe(Long e);

	@Query("SELECT u FROM Ferias u WHERE u.id = ?1")
	public Iterator<Ferias> buscarferiasPorEquipe(Long e);
}