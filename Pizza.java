package exercise1;

public class Pizza extends Food {

	public static void main(String[] args) {
		Food food = new Food();
		food.cost = 200;
		food.quantity = 250;
		food.color = "Red";
		food.calories = 100;
		food.taste = "sweet";
		food.buying();
		food.eating();
	}

}
