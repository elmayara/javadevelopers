package es.cabsa.javadevelopers.services;

import org.springframework.data.jpa.repository.JpaRepository;

import es.cabsa.javadevelopers.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long>{

}
