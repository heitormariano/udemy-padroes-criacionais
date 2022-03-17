package br.com.udemy.builder.meal.gof.director;

import br.com.udemy.builder.meal.gof.builder.FastFoodMealBuilder;
import br.com.udemy.builder.meal.gof.model.FastFoodMeal;

public class MealDirector {

	private FastFoodMealBuilder builder;

	public MealDirector(FastFoodMealBuilder builder) {
		this.builder = builder;
	}

	public void generateCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
	}

	public FastFoodMeal getCombo() {
		return builder.getMeal();
	}
}
