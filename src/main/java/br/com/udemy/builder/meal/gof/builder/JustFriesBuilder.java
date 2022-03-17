package br.com.udemy.builder.meal.gof.builder;

public class JustFriesBuilder extends FastFoodMealBuilder {

	@Override
	public void buildDrink() {
		this.meal.setDrink(null);
	}

	@Override
	public void buildMain() {
		this.meal.setMain("Large Fries");
	}

	@Override
	public void buildSide() {
		this.meal.setSide(null);
	}

	@Override
	public void buildDessert() {
		this.meal.setDessert(null);
	}

	@Override
	public void buildGift() {
		this.meal.setGift(null);
	}

}
