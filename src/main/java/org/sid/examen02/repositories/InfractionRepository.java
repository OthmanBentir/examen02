package org.sid.examen02.repositories;

import org.sid.examen02.entities.Infraction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface InfractionRepository extends JpaRepository<Infraction,Long> {

}
