package exercise1;

public class MethodOverloadingDemo {

	        void display(int a){	
			System.out.println(a);
		}
		void display(int a, int b){
			System.out.println(a+" "+b);
		}
		void display(int a, double b){
			System.out.println(a+" "+b);
		}
		public static void main(String[] args){
			MethodOverloadingDemo m = new MethodOverloadingDemo();
			m.display(10);
			m.display(15,20);
			m.display(25,60.78);
		} 
}
