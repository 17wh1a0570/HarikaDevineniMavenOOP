package com.epam.NewYearsGift;

public class DarkChocolate implements Chocolates{
	double weightOfChoc = 50;
	@Override
	public double calcWeight(int numOfChoc) {
		// TODO Auto-generated method stub
		return numOfChoc * weightOfChoc;
	}
}
