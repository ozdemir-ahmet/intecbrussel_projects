package be.intecbrussel.the_notebook.entities.plant_entities;

public class Tree extends Plant {
	private LeafType leafType;
	
	public Tree(String name) {
		this(name,0);
	}
	
	public Tree(String name, double height) {
		super(name, height);
	}

	public LeafType getLeafType() {
		return leafType;
	}

	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}

	@Override
	public String toString() {
		return super.getName() + " (Tree), height:" + super.getHeight();
	}
}
