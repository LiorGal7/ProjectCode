package portfolio.logic;

import java.util.List;
import java.util.ArrayList;

public class Portfolio {
	
	private double yield;
	private double value;
	private double overallProfit;
	
	private List< Security> Securities = new ArrayList<Security>();
	
//	public Portfolio(double yield , double value, double overallProfit){
//		
//	}

	
	
	public Portfolio (){
	 setOverallProfit(0);
	 setValue(0);
	 setYield(0);	
	}

	public double getYield() {
		return yield;
	}

	public void setYield(double yield) {
		this.yield = yield;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getOverallProfit() {
		return overallProfit;
	}

	public void setOverallProfit(double overallProfit) {
		this.overallProfit = overallProfit;
	}

	public List<Security> getSecurities() {
		return Securities;
	}

	public void setSecurities(List<Security> securities) {
		Securities = securities;
	}
	
	
}
