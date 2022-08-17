package exercise1;

public class LoopStatementDemo {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++)
		{
        System.out.print(i+" ");
		}
		System.out.println("");
		
		
	    for(int j=10; j>=1; j--)
	    {
	    System.out.print(j+" ");
	    }
	    System.out.println("");
	    
	    
	    String name = "Ajaykumar";
	    System.out.println(name);
	    
	    
	    int k = 1;
	    do
	    {
	    System.out.print(k+++" ");
	    }
	    while(k<=5);
	    System.out.println(" ");
	    
	    
	    int l = 1;
	    while(l<=5)
	    {
	    System.out.print(l+++" ");
	    }
	    System.out.println("");
	    
	    
	    for(int m=2; m<=10; m++)
	    {
	    	if(m%2==0)
	    	{
	    	System.out.print(m+" ");
	    	}
	    }
	}

}
