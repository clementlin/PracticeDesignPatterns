package clement.FactoryPattern.PizzaSeries;

public abstract class Pizza {
	
	String name;

	public Pizza()
	{
		
	}
	
	public String getName() {
		return name;
	}
	void prepare() {
		System.out.println("Prepareing "+name);
	}
	
	void bake(){
		System.out.println("Bakeing "+name);
	}
	
	void cut(){
		System.out.println("Cuting the "+name);
	}
	
	void box(){
		System.out.println("Place " + name + "in box");
	}
	
}
