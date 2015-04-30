// The California Store is composed with a California pizza ingredient factory. This will be used to
// produce the ingredients for all California style pizzas.
public class CaliforniaPizzaStore extends PizzaStore {
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		// The California Store is composed with a California pizza ingredient factory. This will be used
		// to produce the ingredients for all California style pizzas.
		PizzaIngredientFactory ingredientFactory = new CaliforniaPizzaIngredientFactory();
		if (item.equals("cheese")) {
			// we now pass each pizza the factory that should be used to produce its ingredients.
			// Look at the code for CheesePizza.java and understand how the pizza and the 
			// factory work together!
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("California Style Cheese Pizza");
			}
		else if (item.equals("veggie")) {
			// for each type of pizza, we instantiate a new Pizza and give it the factory
			// it needs to get its ingredients
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("California Style Veggie Pizza");
			}
		else if (item.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("California Style Clam Pizza");
			}
		else if (item.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("California Style Pepperoni Pizza");
		}
		return pizza;
	}
}