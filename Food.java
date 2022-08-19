package exercise1;

public class Food {
	
    int cost;
    int quantity;
    String color;
    int calories;
    String taste;
    void buying() {
    	System.out.println(cost);
    	System.out.println(quantity);
    }
    void eating() {
    	System.out.println(color);
    	System.out.println(calories);
    	System.out.println(taste);
    }
	public static void main(String[] args) {
	Food food = new Food();
	    food.cost = 100;
	    food.quantity = 500;
	    food.color = "Brown";
	    food.calories = 200;
	    food.taste = "spicy";
	    food.buying();
	    food.eating();
	}
}
