package com.epam.NewYearsGift;

public class Gems implements Chocolates{
	double weightOfChoc = 5;
	@Override
	public double calcWeight(int numOfChoc) {
		// TODO Auto-generated method stub
		return numOfChoc * weightOfChoc;
	}
}
