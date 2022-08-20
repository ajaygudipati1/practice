package exercise1;

public class BestFriend extends Friend {
	
	  public void toEat() {
   	   System.out.println("Biriyani");
   	   System.out.println("Fruit Salad");
   	   System.out.println("Chicken");
      }
	  
	public static void main(String[] args) {
	   BestFriend bestfriend = new BestFriend();
	   bestfriend.toEat();
	}
}
