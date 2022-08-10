package br.com.udemy.builder.meal.functional.model;

public class FastFoodMeal {

	// atributos finais (não podem ser modificados)
	private final String drink;
	private final String main;
	private final String side;
	private final String dessert;
	private final String gift;

	public FastFoodMeal(String drink, String main, String side, String dessert, String gift) {
		this.drink = drink;
		this.main = main;
		this.side = side;
		this.dessert = dessert;
		this.gift = gift;
	}

	// classe apresenta apenas os getters
	public String getDrink() {
		return drink;
	}

	public String getMain() {
		return main;
	}

	public String getSide() {
		return side;
	}

	public String getDessert() {
		return dessert;
	}

	public String getGift() {
		return gift;
	}

	@Override
	public String toString() {
		return "FastFoodMeal [drink=" + drink + ", main=" + main + ", side=" + side + ", dessert=" + dessert + ", gift="
				+ gift + "]";
	}

	public static class Builder {
		// mandatory
		private String main;

		// optionals
		private String drink;
		private String side;
		private String dessert;
		private String gift;

		public Builder(String main) {
			this.main = main;
		}

		public Builder forDrink(String drink) {
			this.drink = drink;
			return this;
		}

		public Builder andSide(String side) {
			this.side = side;
			return this;
		}

		public Builder andDessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public Builder andGift(String gift) {
			this.gift = gift;
			return this;
		}

		public FastFoodMeal thatsAll() {
			return new FastFoodMeal(drink, main, side, dessert, gift);
		}
	}

}
