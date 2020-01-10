package br.com.cast.castApi.ferias.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.cast.castApi.ferias.model.Ferias;

@RepositoryRestResource(collectionResourceRel = "ferias", path = "ferias")
public interface FeriasRepository extends PagingAndSortingRepository<Ferias, Long> {

}