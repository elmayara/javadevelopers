package es.cabsa.javadevelopers.es.cabsa.javadevelopers.dto;

import java.io.Serializable;

import es.cabsa.javadevelopers.model.Food;

public class ExampleDTO implements Serializable {

	
	private Long id;
	private String name;
	private String legs;
	private Food food;
	public ExampleDTO(Long id, String name, String legs, Food food) {
		super();
		this.id = id;
		this.name = name;
		this.legs = legs;
		this.food = food;
	}
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLegs() {
		return legs;
	}
	public void setLegs(String legs) {
		this.legs = legs;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	
	
}
