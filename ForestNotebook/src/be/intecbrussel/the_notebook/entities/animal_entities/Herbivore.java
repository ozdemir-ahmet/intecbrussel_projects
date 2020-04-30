package be.intecbrussel.the_notebook.entities.animal_entities;

import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

public class Herbivore extends Animal {
	private Set<Plant> plantDiet = new HashSet<>();
	
	public Herbivore(String name) {
		this (name, 0, 0, 0);
	}
	
	public Herbivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	public Set<Plant> getPlantDiet() {
		return this.plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}
	
	public void addPlantToDiet (Plant plant) {
		if (plant != null) {
			this.plantDiet.add(plant);
		}
	}
	
	public void printDiet() {
		System.out.println("The diet list for this herbivore contains:");
		for (Plant p : this.plantDiet) {
			System.out.println(p.getName());
		}
	}

	@Override
	public String toString() {
		return super.getName() + " (Herbivore), height: " + super.getHeight() + ", length: " + super.getLength()+
				", weight: " + super.getWeight();
	}
	
	
}
