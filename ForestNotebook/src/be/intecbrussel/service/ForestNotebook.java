package be.intecbrussel.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

public class ForestNotebook {
	private List<Carnivore> carnivores = new LinkedList<>();
	private List<Omnivore> omnivores = new LinkedList<>();
	private List<Herbivore> herbivores = new LinkedList<>();
	private int plantCount=0;
	private int animalCount=0;
	private List<Animal> animals = new LinkedList<>();
	private List<Plant> plants = new LinkedList<>();
	
	public ForestNotebook () {
		
	}

	public List<Carnivore> getCarnivores() {
		return carnivores;
	}

	public void setCarnivores(List<Carnivore> carnivores) {
		this.carnivores = carnivores;
	}

	public List<Omnivore> getOmnivores() {
		return omnivores;
	}

	public void setOmnivores(List<Omnivore> omnivores) {
		this.omnivores = omnivores;
	}

	public List<Herbivore> getHerbivores() {
		return herbivores;
	}

	public void setHerbivores(List<Herbivore> herbivores) {
		this.herbivores = herbivores;
	}

	public int getPlantCount() {
		return plantCount;
	}

	public int getAnimalCount() {
		return animalCount;
	}

	public void addAnimal (Animal animal) {
		if (this.animals.stream().filter (a -> a.equals(animal)).count() !=0) {
			System.out.println(animal.getName() + " is already added into the list");
		} else {
			animals.add(animal);
			animalCount ++;
			if (animal instanceof Carnivore) {
				this.carnivores.add((Carnivore)animal);
			} else if (animal instanceof Omnivore) {
				this.omnivores.add((Omnivore)animal);
			} else {
				this.herbivores.add((Herbivore)animal);
			}
		}
	}
	
	public void addPlant (Plant plant) {
		if (this.plants.stream().filter (p -> p.equals(plant)).count() !=0) {
			System.out.println(plant.getName() + " is already added into the list");
		} else {
			plants.add(plant);
			plantCount ++;
		}
	}
	
	public void printNotebook () {
		System.out.println("Animals in the list: ");
		this.animals.stream().forEach(System.out::println);
		System.out.println("\nPlants in the list: ");
		this.plants.stream().forEach(System.out::println);
	}
	
	public void sortAnimalsByName () {
		Collections.sort(animals);
	}
	
	public void sortPlantsByName () {
		Collections.sort(plants);
	}
	
	public void sortAnimalsByHeight () {
		animals.sort((animal1, animal2) -> (int) (100*(animal1.getHeight() - animal2.getHeight())));
	}
	
	public void sortPlantsByHeight () {
		plants.sort((plant1, plant2) -> (int) (100*(plant1.getHeight() - plant2.getHeight())));
	}
}
