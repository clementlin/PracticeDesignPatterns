package clement.FactoryPattern;

import clement.FactoryPattern.PizzaSeries.Pizza;

public abstract class PizzaStore {
	
	public PizzaStore(){
		
	}
	
	public Pizza orderPizza(String type)
	{
		Pizza pizza;
		pizza = createPizza(type);
		return pizza;
	}
	
	protected abstract Pizza createPizza(String type);
}
