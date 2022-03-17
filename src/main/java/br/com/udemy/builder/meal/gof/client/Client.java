package br.com.udemy.builder.meal.gof.client;

import br.com.udemy.builder.meal.gof.builder.FastFoodMealBuilder;
import br.com.udemy.builder.meal.gof.builder.FatMealBuilder;
import br.com.udemy.builder.meal.gof.builder.JustFriesBuilder;
import br.com.udemy.builder.meal.gof.builder.MenuOneBuilder;
import br.com.udemy.builder.meal.gof.builder.MenuTwoBuilder;
import br.com.udemy.builder.meal.gof.director.MealDirector;

public class Client {
	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);

		MealDirector mealDirector = new MealDirector(builder);
		mealDirector.generateCombo();
		System.out.println(mealDirector.getCombo());

		System.out.println("------------------");
	}

	public static void main(String[] args) {
		order("Just Fries", new JustFriesBuilder());
		order("Burguer", new MenuOneBuilder());
		order("Veggie Burguer", new MenuTwoBuilder());
		order("Heart Atack", new FatMealBuilder());
	}
}
