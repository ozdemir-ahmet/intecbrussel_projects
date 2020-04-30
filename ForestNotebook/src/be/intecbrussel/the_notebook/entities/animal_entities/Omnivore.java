package be.intecbrussel.the_notebook.entities.animal_entities;

import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

public class Omnivore extends Animal {
	private Set<Plant> plantDiet = new HashSet<>();
	private double maxFoodSize;
	
	public Omnivore(String name) {
		this (name, 0, 0, 0);
	}
	
	public Omnivore(String name, double weight, double height, double length) {
		super(name, weight, height, length);
	}

	public Set<Plant> getPlantDiet() {
		return plantDiet;
	}

	public void setPlantDiet(Set<Plant> plantDiet) {
		this.plantDiet = plantDiet;
	}

	public double getMaxFoodSize() {
		return maxFoodSize;
	}

	public void setMaxFoodSize(double maxFoodSize) {
		this.maxFoodSize = maxFoodSize;
	}
	
	public void addPlantToDiet (Plant plant) {
		if (plant != null) {
			this.plantDiet.add(plant);
		}
	}
	
	@Override
	public String toString() {
		return super.getName() + " (Omnivore), height: " + super.getHeight() + ", length: " + super.getLength()+
				", weight: " + super.getWeight();
	}
}
