// the Chicago ingredient factory implements the interface for all ingredient
// factories. For each ingredient in the ingredient family, we create Chicago version.
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new ThickCrustDough();
	}
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
	public Cheese createCheese() {
		return new MozerellaCheese();
	}
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Oregano(), new Eggplant(), new Spinach(), new BlackOlives() };
		return veggies;
	}
	// Best sliced Pepperoni. This is shared between New York and Chicago.
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	// New York on the coast – so it gets fresh clams. Chicago gets frozen clams
	public Clams createClam() {
		return new FrozenClams();
	}
}