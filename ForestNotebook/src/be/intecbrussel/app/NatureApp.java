package be.intecbrussel.app;

import java.util.HashSet;
import java.util.Set;

import be.intecbrussel.service.ForestNotebook;
import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.Bush;
import be.intecbrussel.the_notebook.entities.plant_entities.Flower;
import be.intecbrussel.the_notebook.entities.plant_entities.LeafType;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;
import be.intecbrussel.the_notebook.entities.plant_entities.Scent;
import be.intecbrussel.the_notebook.entities.plant_entities.Tree;
import be.intecbrussel.the_notebook.entities.plant_entities.Weed;

public class NatureApp {

	public static void main(String[] args) {
		ForestNotebook myForestNotebook = new ForestNotebook();
		
		Flower jasmine = new Flower("Jasmine", 0.6);
		jasmine.setSmell(Scent.SWEET);
		Flower rose = new Flower("Rose");
		rose.setSmell(Scent.MUSKY);
		rose.setHeight(1.8);
		
		Tree oakTree = new Tree("Oak tree", 5.2);
		oakTree.setLeafType(LeafType.HEART);
		
		Weed weed = new Weed("Weed", 1.5);
		weed.setArea(25);
		
		Bush blueBerry = new Bush("Blue berry", 0.8);
		blueBerry.setFruit("Blue berry");
		blueBerry.setLeafType(LeafType.NEEDLE);
		
		Carnivore wolf = new Carnivore("Wolf", 30, 50, 80);
		wolf.setMaxFoodSize(50);
		
		Carnivore bear = new Carnivore("Bear");
		bear.setHeight(180);
		bear.setLength(50);
		bear.setWeight(100);
		bear.setMaxFoodSize(80);
		
		Carnivore jackal = new Carnivore("Jackal", 20, 20, 60);
		jackal.setMaxFoodSize(10);
		
		Set<Plant> plantDiet1 = new HashSet<>();
		plantDiet1.add(rose);
		plantDiet1.add(jasmine);
		
		Set<Plant> plantDiet2 = new HashSet<>();
		plantDiet2.add(oakTree);
		plantDiet2.add(blueBerry);
		
		Herbivore cow = new Herbivore("Caw", 150, 120, 200);
		cow.setPlantDiet(plantDiet1);
		
		Herbivore koala = new Herbivore("Koala");
		koala.setHeight(50);
		koala.setLength(50);
		koala.setWeight(20);
		koala.setPlantDiet(plantDiet2);
		
		Herbivore monkey = new Herbivore("Monkey", 40, 120, 50);
		monkey.setPlantDiet(plantDiet2);
		
		Omnivore eagle = new Omnivore("Bold eagle", 30, 40, 120);
		eagle.setMaxFoodSize(30);
		eagle.setPlantDiet(plantDiet1);
		
		Omnivore ant = new Omnivore("Ant");
		ant.setHeight(0.3);
		ant.setLength(2);
		ant.setWeight(0.04);
		ant.setMaxFoodSize(2);
		ant.setPlantDiet(plantDiet2);
		
		Omnivore crow = new Omnivore("Black Crow", 15, 20, 25);
		crow.setMaxFoodSize(25);
		crow.setPlantDiet(plantDiet1);
		
		myForestNotebook.addAnimal(ant);
		myForestNotebook.addAnimal(crow);
		myForestNotebook.addAnimal(eagle);
		myForestNotebook.addAnimal(monkey);
		myForestNotebook.addAnimal(ant);
		myForestNotebook.addAnimal(koala);
		myForestNotebook.addAnimal(cow);
		myForestNotebook.addAnimal(jackal);
		myForestNotebook.addAnimal(bear);
		myForestNotebook.addAnimal(wolf);
		myForestNotebook.addAnimal(bear);
		System.out.println("===========================================");
		myForestNotebook.addPlant(blueBerry);
		myForestNotebook.addPlant(weed);
		myForestNotebook.addPlant(blueBerry);
		myForestNotebook.addPlant(oakTree);
		myForestNotebook.addPlant(rose);
		myForestNotebook.addPlant(jasmine);
		myForestNotebook.addPlant(rose);
		System.out.println("===========================================");
		System.out.println("Number of Animals in the list: " + myForestNotebook.getAnimalCount());
		System.out.println("Number of Plants in the list: " + myForestNotebook.getPlantCount());
		System.out.println("===========================================");
		myForestNotebook.printNotebook();
		System.out.println("===========================================");
		for (Carnivore c : myForestNotebook.getCarnivores()) {
			System.out.println(c);
		}
		System.out.println("===========================================");
		for (Omnivore o : myForestNotebook.getOmnivores()) {
			System.out.println(o);
		}
		System.out.println("===========================================");
		for (Herbivore h : myForestNotebook.getHerbivores()) {
			System.out.println(h);
		}
		System.out.println("===========================================");
		myForestNotebook.sortAnimalsByName();
		myForestNotebook.sortPlantsByName();
		myForestNotebook.printNotebook();
		System.out.println("===========================================");
		myForestNotebook.sortAnimalsByHeight();
		myForestNotebook.sortPlantsByHeight();
		myForestNotebook.printNotebook();
	}
}

