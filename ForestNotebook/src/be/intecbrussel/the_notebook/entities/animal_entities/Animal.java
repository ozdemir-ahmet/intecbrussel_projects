package be.intecbrussel.the_notebook.entities.animal_entities;

public class Animal implements Comparable<Animal>{
	private String name;
	private double weight;
	private double height;
	private double length;
	
	public Animal (String name) {
		this (name,0,0,0);
	}
	
	public Animal (String name, double weight, double height, double length) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.length = length;
	}

	public String getName() {
		return this.name;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Animal animal) {
		return this.name.compareTo(animal.name);
	}
	
	
}
