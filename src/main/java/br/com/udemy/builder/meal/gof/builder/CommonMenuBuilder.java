package br.com.udemy.builder.meal.gof.builder;

public class CommonMenuBuilder extends FastFoodMealBuilder {

	@Override
	public void buildDrink() {
		this.meal.setDrink("Coke");
	}

	@Override
	public void buildMain() {
		this.meal.setMain("Cheeseburguer");
	}

	@Override
	public void buildSide() {
		this.meal.setSide("Fries");
	}

	@Override
	public void buildDessert() {
		this.meal.setDessert("Apple Pie");
	}

	@Override
	public void buildGift() {
		this.meal.setGift("Avenger's Toy");
	}

}
