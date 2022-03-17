package br.com.udemy.builder.meal.gof.builder;

public class FatMealBuilder extends FastFoodMealBuilder {

	@Override
	public void buildDrink() {
		this.meal.setDrink("MilkShake");

	}

	@Override
	public void buildMain() {
		this.meal.setMain("TripleCheddarBaconBurguer");
	}

	@Override
	public void buildSide() {
		this.meal.setSide("Onion Rings");

	}

	@Override
	public void buildDessert() {
		this.meal.setDessert("Large IceCream");
	}

	@Override
	public void buildGift() {
		this.meal.setGift("Hospital pass");
	}

}
