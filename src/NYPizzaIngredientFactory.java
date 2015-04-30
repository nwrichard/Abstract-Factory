// the NY ingredient factory implements the interface for all ingredient
// factories. For each ingredient in the ingredient family, we create New York version.
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThinCrustDough();
	}
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
	// Best sliced Pepperoni. This is shared between New York and Chicago.
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	// New York on the coast – so it gets fresh clams. Chicago gets frozen clams
	public Clams createClam() {
		return new FreshClams();
	}
}