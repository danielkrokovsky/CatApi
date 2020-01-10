package br.com.cast.castApi.funcionario.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.cast.castApi.funcionario.model.Funcionario;

@RepositoryRestResource(collectionResourceRel = "funcionario", path = "funcionario")
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Long> {

	/*@Query("")
	Iterable<Funcionario> funcionariosPodemTirarFerias();
	*/

}
