package br.com.udemy.builder.meal.fluent.builder;

import br.com.udemy.builder.meal.fluent.model.FastFoodMeal;

public class FastFoodMealBuilder {
	// mandatory
	private String main;

	// optionals
	private String drink;
	private String side;
	private String dessert;
	private String gift;

	public FastFoodMealBuilder(String main) {
		this.main = main;
	}

	public FastFoodMealBuilder forDrink(String drink) {
		this.drink = drink;
		return this;
	}

	public FastFoodMealBuilder andSide(String side) {
		this.side = side;
		return this;
	}

	public FastFoodMealBuilder andDessert(String dessert) {
		this.dessert = dessert;
		return this;
	}

	public FastFoodMealBuilder andGift(String gift) {
		this.gift = gift;
		return this;
	}

	public FastFoodMeal thatsAll() {
		return new FastFoodMeal(drink, main, side, dessert, gift);
	}
}
