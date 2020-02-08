package com.epam.NewYearsGift;

public class Kheer extends SweetQuant implements Sweets{
	final double pricePerKg = 120.50;
	final double quantity = 35.8;
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		System.out.println("Price per kg of kheer is: " + pricePerKg + "\nAvailable quantity is: " + quantity);
	}

	@Override
	double calcPrice(double weight) {
		// TODO Auto-generated method stub
		return weight * pricePerKg;
	}

	@Override
	double calcWeight(double cost) {
		// TODO Auto-generated method stub
		return cost / pricePerKg;
	}
	
}
