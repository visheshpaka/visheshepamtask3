package VisheshCalculator;

public class Modulus {
	double mod(int x,int y)
	{
		double num=0.0;
	       try
	       {
	    	   num=x%y;
	       }
	       catch(ArithmeticException ae)
	       {
	    	   System.out.println("Modulus by zero is not possible");
	       }
	       return num;
	}

	}


