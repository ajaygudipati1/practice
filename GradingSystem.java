package exercise1;

public class GradingSystem {

	public static void main(String[] args) {
	char grade = 'O';
	 switch(grade) {
	 
	 case'O': {
		 System.out.println("Outstanding");
	 }
	 break;
	 
	 case'A': {
		 System.out.println("VeryGood");
	 }
	 break;
	 
	 case'B': {
		 System.out.println("Good");
	 }
	 break;
	 
	 case'C': {
		 System.out.println("Average");
	 }
	 break;
	 
	 case'D': {
		 System.out.println("Marginal");
	 }
	 break;
	 
	 default: {
		 System.out.println("Fail");
	 }
	 }

	}

}
