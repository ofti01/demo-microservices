package com.lotfi.clientservice.repositories;

import com.lotfi.clientservice.entities.Client;
import com.lotfi.clientservice.entities.CustomClient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = CustomClient.class)
public interface ClientRepository extends CrudRepository<Client, Long> {
}
