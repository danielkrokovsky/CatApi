package br.com.cast.castApi.funcionario.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.cast.castApi.funcionario.model.Funcionario;

@RepositoryRestResource(collectionResourceRel = "funcionarios", path = "funcionarios")
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Long> {

	@Query(value = "SELECT * FROM FUNCIONARIO d where DATEDIFF(YEAR,d.DT_CONTRATACAO, CURRENT_DATE)  > 1", nativeQuery = true)	
	public Collection<Funcionario> funcionariosPodemTirarFerias();
	

}
