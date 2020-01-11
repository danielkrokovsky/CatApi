package br.com.cast.castApi.equipe.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.cast.castApi.equipe.model.Equipe;

@RepositoryRestResource(collectionResourceRel = "equipe", path = "equipe")
public interface EquipeRepository extends PagingAndSortingRepository<Equipe, Long> {

	@Query("SELECT u FROM Equipe u WHERE u.id = ?1")
	public Equipe buscarEquipePorId(Long e);
}
