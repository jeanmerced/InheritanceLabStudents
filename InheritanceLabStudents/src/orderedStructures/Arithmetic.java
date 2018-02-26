package orderedStructures;

public class Arithmetic extends Progression {
	private double commonDifference; 
	
	public Arithmetic(double firstValue, double commonDifference) { 
		super(firstValue); 
		this.commonDifference = commonDifference; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(!this.state)
			throw new IllegalStateException("nextValue: Invalid state detected");
		current = current + commonDifference; 
		return current;
	}

	@Override
	public double getTerm(int n) {
		return this.firstValue() + commonDifference*(n-1);
	}
	
	@Override
	public String toString() {
		return "Arith(" + this.firstValue() + ", " + commonDifference + ")";
	}
}
