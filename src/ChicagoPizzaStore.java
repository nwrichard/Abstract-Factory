// The Chicago Store is composed with a Chicago pizza ingredient factory. This will be used to
// produce the ingredients for all Chicago style pizzas.
public class ChicagoPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		// The Chicago Store is composed with a Chicago pizza ingredient factory. This will be used
		// to produce the ingredients for all Chicago style pizzas.
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		if (item.equals("cheese")) {
			// we now pass each pizza the factory that should be used to produce its ingredients.
			// Look at the code for CheesePizza.java and understand how the pizza and the 
			// factory work together!
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
			}
		else if (item.equals("veggie")) {
			// for each type of pizza, we instantiate a new Pizza and give it the factory
			// it needs to get its ingredients
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
			}
		else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
			}
		else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
		}
		return pizza;
	}
}