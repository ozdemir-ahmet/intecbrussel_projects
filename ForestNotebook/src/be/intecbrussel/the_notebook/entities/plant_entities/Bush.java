package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant{
	private String fruit;
	private LeafType leafType;
	
	public Bush(String name) {
		this (name,0);
	}
	
	public Bush(String name, double height) {
		super (name,height);
	}

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	public LeafType getLeafType() {
		return leafType;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	@Override
	public String toString() {
		return super.getName() + " (Bush), height:" + super.getHeight();
	}
}
