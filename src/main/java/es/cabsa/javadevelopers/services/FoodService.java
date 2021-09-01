package es.cabsa.javadevelopers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import es.cabsa.javadevelopers.model.Animal;
import es.cabsa.javadevelopers.model.Food;

public class FoodService{
	
	@Autowired
	private FoodRepository foodRepository;
	
	public List<Food> consulta(){
		return foodRepository.findAll();
	}
	
	public Optional<Food> consultaPorID(long id){
		return foodRepository.findById(id);
	}
	
	public Food insertar(Food c) {
		return foodRepository.save(c);
	}
	
	public void eliminar(Food c) {
		foodRepository.delete(c);
	}
	
}
