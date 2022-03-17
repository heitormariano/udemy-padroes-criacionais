package br.com.udemy.builder.meal.fluent.client;

import br.com.udemy.builder.meal.fluent.builder.FastFoodMealBuilder;
import br.com.udemy.builder.meal.fluent.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal cheeseBurgerCombo = new FastFoodMealBuilder("Cheeseburguer").forDrink("Coke").andSide("Fries")
				.andDessert("Apple Pie").andGift("Avenger's Toy").thatsAll();

		System.out.println(cheeseBurgerCombo);

		FastFoodMeal justFries = new FastFoodMealBuilder("Large Fries").thatsAll();
		System.out.println(justFries);

		FastFoodMeal fatCombo = new FastFoodMealBuilder("TripleCheddarBaconBurguer").forDrink("MilkShake")
				.andSide("Onion Rings").andDessert("special petit gateau").andGift("2 Kilograms").thatsAll();

		System.out.println(fatCombo);
	}
}
