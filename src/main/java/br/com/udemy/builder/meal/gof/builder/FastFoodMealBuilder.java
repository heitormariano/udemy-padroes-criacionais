package br.com.udemy.builder.meal.gof.builder;

import br.com.udemy.builder.meal.gof.model.FastFoodMeal;

public abstract class FastFoodMealBuilder {

	protected FastFoodMeal meal;

	public FastFoodMealBuilder() {
		this.meal = new FastFoodMeal();
	}

	public FastFoodMeal getMeal() {
		return meal;
	}

	public abstract void buildDrink();

	public abstract void buildMain();

	public abstract void buildSide();

	public abstract void buildDessert();

	public abstract void buildGift();

	// Abordagem Alternativa (envolvendo os m�todos da classe)
	/* A keyword abstract poderia ser retirada. Dessa forma, evita-se a obrigatoriedade
	 * de implementa��o de todos os m�todos */

	/*
	public void buildDrink() {
	}

	public void buildMain() {
	}

	public void buildSide() {
	}

	public void buildDessert() {
	}

	public void buildGift() {
	}
	*/
}
