package TesterClasses;

import orderedStructures.Arithmetic;
import orderedStructures.Fibonacci;
import orderedStructures.Geometric;
import orderedStructures.Progression;

public class ProgressionTester3 {

	public static void main(String[] args) { 
		Progression p; 
		
		System.out.println("\n\n\nTesting Geometric with IllegalStateException:"); 
		p = new Geometric(2, 3); 
		//System.out.println(p.firstValue() + p.nextValue()); 
		System.out.println(p.nextValue());
		
		System.out.println("\n\n\nTesting Arithmetic with IllegalStateException:"); 
		p = new Arithmetic(2, 3); 
		//System.out.println(p.firstValue() + p.nextValue());
		System.out.println(p.nextValue());
	} 
}
