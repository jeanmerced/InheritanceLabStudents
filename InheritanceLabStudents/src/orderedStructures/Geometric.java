package orderedStructures;

public class Geometric extends Progression {

	private double commonFactor; 
	
	public Geometric(double firstValue, double commonFactor) { 
		super(firstValue); 
		this.commonFactor = commonFactor; 
	}
	
	@Override
	public double nextValue() throws IllegalStateException {
		if(!this.state)
			throw new IllegalStateException("nextValue: Invalid state detected");
		current = current * commonFactor; 
		return current;
	}
	
	@Override
	public double getTerm(int n) {
		return this.firstValue()*Math.pow(commonFactor, n-1);
	}
	
	@Override
	public String toString() {
		return "Geom(" + this.firstValue() + ", " + commonFactor + ")";
	}

}
