package exercise1;

public class StringDemo1 {

	public static void main(String[] args) {
		
		 String message = "That was great - lol.";
		 System.out.println(message.replaceFirst("lol","laugh out loud"));
		 
		 String name1 = "ALEX";
		 String substr1 = name1.substring(0,1);		 
		 String lowca1 = name1.toLowerCase();
		 String substr2 = lowca1.substring(1);
		 System.out.println(substr1+substr2);
		 
		 String movie = "Jersey";
		 String book = "NaaIstam";
		 System.out.println("My favorite movie is "+movie+" and my favorite book is "+book+".");
		 
		 String animal = "Tiger";
		 String food = "Biryani";
		 System.out.println("My favorite animal is "+animal+" and my favorite food is "+food+".");
		 
		 String name = "Julian";
	     String color = "green";
	     String food1 = "pizza";
	     System.out.println(name+"'s favorite color is "+color+". His favorite food is "+food1+".");

	}

}
