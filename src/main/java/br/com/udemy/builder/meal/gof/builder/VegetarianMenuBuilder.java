package br.com.udemy.builder.meal.gof.builder;

public class VegetarianMenuBuilder extends FastFoodMealBuilder {

	@Override
	public void buildDrink() {
		this.meal.setDrink("Water");
	}

	@Override
	public void buildMain() {
		this.meal.setMain("VeggieBurguer");
	}

	@Override
	public void buildSide() {
		this.meal.setSide("Salad");
	}

	@Override
	public void buildDessert() {
		this.meal.setDessert("Apple");
	}

	@Override
	public void buildGift() {
		this.meal.setGift("I'm Veggie's Stamp");
	}

}
