package br.com.cast.castApi.ferias.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.cast.castApi.ferias.model.Ferias;

@RepositoryRestResource(collectionResourceRel = "ferias", path = "ferias")
public interface FeriasRepository extends PagingAndSortingRepository<Ferias, Long> {

	@Query("SELECT u FROM Ferias u WHERE u.funcionario.matricula = ?1")
	public Ferias buscarFeriasPorMatriculaFuncionario(String matricula);
}