package es.cabsa.javadevelopers.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import es.cabsa.javadevelopers.services.FoodService;
import es.cabsa.javadevelopers.model.*;


public class FoodController {

	@Autowired
	private FoodService foodService;
	
	@RequestMapping(value="/food", method=RequestMethod.GET)
	  public ResponseEntity<List<Food>> consultaFood(){
			return new ResponseEntity<List<Food>>(foodService.consulta(),HttpStatus.OK);		
		}

	@RequestMapping(value="/food", method=RequestMethod.POST)
	public ResponseEntity <Food> insertar(@RequestBody Food food){ 
		return new ResponseEntity<Food>(foodService.insertar(food),HttpStatus.OK);
	}
	
	@RequestMapping(value="/food", method=RequestMethod.PUT)
	public ResponseEntity <Food> actualizar(@RequestBody Food food){
		return new ResponseEntity<Food>(foodService.insertar(food),HttpStatus.OK);		
	}
	
  @RequestMapping(value = "/food/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> eliminarPorId(@PathVariable("id") long id){
	  	Optional<Food> foodOpt=foodService.consultaPorID(id);
		  	if (foodOpt.isPresent()) {
		  		Food food= foodOpt.get();
		  		foodService.eliminar(food);
		  		return new ResponseEntity<String>("food eliminado",HttpStatus.OK);
		  	}
		  	else {
		  		return new ResponseEntity<String>("food no existe",HttpStatus.OK);
		  	}
	}
	
}
