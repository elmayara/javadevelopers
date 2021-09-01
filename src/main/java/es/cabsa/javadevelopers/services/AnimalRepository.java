package es.cabsa.javadevelopers.services;

import org.springframework.data.jpa.repository.JpaRepository;

import es.cabsa.javadevelopers.model.*;

public interface AnimalRepository extends JpaRepository<Animal, Long>{

}
