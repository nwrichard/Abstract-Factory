// To make a pizza now, we need a factory to provide the ingredients. So each pizza
// class gets a // factory passed into its constructor, and it is stored in an instance\
// variable.
public class CheesePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	// Here is where the magic happens. The prepare() method steps through creating a
	// cheese pizza, and each time it needs an ingredient it asks the factory to produce it
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}
}