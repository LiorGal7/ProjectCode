package portfolio.logic;

public abstract class Security {
	private double value;

	public Security(double value){
		setValue(value);
	}
	
	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}

