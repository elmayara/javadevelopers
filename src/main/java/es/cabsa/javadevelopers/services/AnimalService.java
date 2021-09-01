package es.cabsa.javadevelopers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import es.cabsa.javadevelopers.model.Animal;
import es.cabsa.javadevelopers.model.Food;

 
public class AnimalService{
	
	@Autowired
	private AnimalRepository animalRepository;
	
	public List<Animal> consulta(){
		return animalRepository.findAll();
	}
	
	public Optional<Animal> consultaPorID(long id){
		return animalRepository.findById(id);
	}
	
	public Animal insertar(Animal c) {
		return animalRepository.save(c);
	}
	
	public void eliminar(Animal c) {
		animalRepository.delete(c);
	}
	
}
