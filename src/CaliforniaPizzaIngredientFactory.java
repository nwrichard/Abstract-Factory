// the California ingredient factory implements the interface for all ingredient
// factories. For each ingredient in the ingredient family, we create California version.
public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
	public Dough createDough() {
		return new VeryThinCrust();
	}
	public Sauce createSauce() {
		return new BreschettaSauce();
	}
	public Cheese createCheese() {
		return new GoatCheese();
	}
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Mushroom(), new Onion(), new HotPepper(), new Rosemary() };
		return veggies;
	}
	// Best sliced Pepperoni. This is shared between New York and Chicago.
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	// New York on the coast – so it gets fresh clams. Chicago gets frozen clams
	public Clams createClam() {
		return new Calamari();
	}
}