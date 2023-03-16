package br.com.udemy.builder.meal.gof.client;

import br.com.udemy.builder.meal.gof.builder.FastFoodMealBuilder;
import br.com.udemy.builder.meal.gof.builder.FatMealBuilder;
import br.com.udemy.builder.meal.gof.builder.JustFriesBuilder;
import br.com.udemy.builder.meal.gof.builder.CommonMenuBuilder;
import br.com.udemy.builder.meal.gof.builder.VegetarianMenuBuilder;
import br.com.udemy.builder.meal.gof.director.MealDirector;

public class Client {
	public static void order(String name, FastFoodMealBuilder builder) {
		System.out.println("Ordering a " + name);

		MealDirector mealDirector = new MealDirector(builder);
		mealDirector.generateCombo();

		System.out.println(mealDirector.getCombo());
		System.out.println(obterLinhaSeparadora());
	}

	public static String obterLinhaSeparadora() {
		String linhaBase = "-------------------- * --------------------";
		String linhaSeparadora = "";
		for (int i = 0; i < 3; i++) {
			linhaSeparadora += linhaBase;
		}
		return linhaSeparadora;
	}

	public static void main(String[] args) {
		order("Just Fries", new JustFriesBuilder());
		order("Burguer", new CommonMenuBuilder());
		order("Veggie Burguer", new VegetarianMenuBuilder());
		order("Heart Atack", new FatMealBuilder());
	}
}
