package kosta.data;

import java.util.HashMap;

public class Order {

	private HashMap<Food, Integer> ordered;

	Order() {
		ordered = new HashMap<Food, Integer>();
	}

	public HashMap<Food, Integer> getOrdered() {
		return ordered;
	}

	Order(Food food, int amount) {
		ordered = new HashMap<Food, Integer>();
		ordered.put(food, amount);
	}
}
