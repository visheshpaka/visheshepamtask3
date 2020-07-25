package VisheshCalculator;

public class Division {
	double div(int x,int y)
	{
		double num=0.0;
	       try
	       {
	    	   num=x/y;
	       }
	       catch(ArithmeticException ae)
	       {
	    	   System.out.println("Divide by zero is not possible");
	       }
	       return num;
	}

}
