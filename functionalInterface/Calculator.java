package functionalInterface;

import java.util.function.BiFunction;

public class Calculator {
	
	public static void main (String args[]) {

		 

		Integer x=30,y=20;

		 

		System.out.println("addition: "+evaluate(x, y, (a,b)->a+b));
		
		System.out.println("substraction: "+evaluate(x, y, (a,b)->a-b));

		System.out.println("multiply: "+evaluate(x, y, (a,b)->a*b));

		System.out.println("division: "+evaluate(x, y, (a,b)->a/b));

		

		 

		 

		     

		  }

		 

		  public static Integer evaluate(Integer t, Integer u, BiFunction<Integer, Integer, Integer> fn) {

		    return fn.apply(t, u);

		  }

}
