package be.intecbrussel.the_notebook.entities.plant_entities;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;

public class Plant implements Comparable<Plant>{
	private String name;
	private double height;
	
	public Plant(String name) {
		this (name,0);
	}

	public Plant(String name, double height) {
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return this.name;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public int compareTo(Plant plant) {
		return this.name.compareTo(plant.name);
	}
}
