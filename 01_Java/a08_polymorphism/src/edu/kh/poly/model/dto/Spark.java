package edu.kh.poly.model.dto;

public class Spark extends Car{
	
	public Spark() {
		// TODO Auto-generated constructor stub
	}
	
	private double discountRate; //할인율

	@Override
	public String toString() {
		return super.toString() + " / Spark [discountRate=" + discountRate + "]";
	}

	public Spark(int wheel, int seat, String fuel, double discountRate) {
		super(wheel, seat, fuel);
		this.discountRate = discountRate;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	

}
