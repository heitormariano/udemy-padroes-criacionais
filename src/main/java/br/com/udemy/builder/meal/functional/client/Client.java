package br.com.udemy.builder.meal.functional.client;

import br.com.udemy.builder.meal.functional.model.FastFoodMeal;

public class Client {

	public static void main(String[] args) {
		FastFoodMeal cheeseBurgerCombo = new FastFoodMeal.Builder("Cheeseburguer").forDrink("Coke").andSide("Fries")
				.andDessert("Apple Pie").andGift("Avenger's Toy").thatsAll();

		System.out.println(cheeseBurgerCombo);

		FastFoodMeal justFriesCombo = new FastFoodMeal.Builder("Large Fries").thatsAll();
		System.out.println(justFriesCombo);

		FastFoodMeal fatCombo = new FastFoodMeal.Builder("TripleCheddarBaconBurguer").forDrink("MilkShake")
				.andSide("Onion Rings").andDessert("special petit gateau").andGift("2 Kilograms").thatsAll();

		System.out.println(fatCombo);
	}
}
