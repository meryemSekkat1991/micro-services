package org.sid.company.dao;

import org.sid.company.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource //expose web service
public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {

}
