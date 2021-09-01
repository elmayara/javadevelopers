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

import es.cabsa.javadevelopers.services.AnimalService;
import es.cabsa.javadevelopers.services.FoodService;
import es.cabsa.javadevelopers.model.*;


@RestController
public class AnimalController {

	@Autowired
	private AnimalService animalService;
	
	
	@RequestMapping(value="/animal", method=RequestMethod.GET)
	  public ResponseEntity<List<Animal>> consultaAnimal(){
			return new ResponseEntity<List<Animal>>(animalService.consulta(),HttpStatus.OK);		
		}
	
	@RequestMapping(value="/animal", method=RequestMethod.POST)
	public ResponseEntity <Animal> insertar(@RequestBody Animal animal){ 
		return new ResponseEntity<Animal>(animalService.insertar(animal),HttpStatus.OK);
	}
	
	@RequestMapping(value="/animal", method=RequestMethod.PUT)
	public ResponseEntity <Animal> actualizar(@RequestBody Animal animal){
		return new ResponseEntity<Animal>(animalService.insertar(animal),HttpStatus.OK);		
	}
	
    @RequestMapping(value = "/animal/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> eliminarPorId(@PathVariable("id") long id){
    	Optional<Animal> animalOpt=animalService.consultaPorID(id);
    	if (animalOpt.isPresent()) {
    		Animal animal= animalOpt.get();
    		animalService.eliminar(animal);
    		return new ResponseEntity<String>("animal eliminado",HttpStatus.OK);
    	}
    	else {
    		return new ResponseEntity<String>("animal no existe",HttpStatus.OK);
    	}
	}
	
	
}
