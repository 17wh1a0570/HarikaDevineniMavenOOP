package com.epam.NewYearsGift;

public class Coffee implements Chocolates{
	double weightOfChoc = 20;
	@Override
	public double calcWeight(int numOfChoc) {
		// TODO Auto-generated method stub
		return numOfChoc * weightOfChoc;
	}
}