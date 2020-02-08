package com.epam.NewYearsGift;
import java.util.*;

public class Gifts {
	//Declaring Scanner and Map objects
	static Scanner scan = new Scanner(System.in);
	static Map<String, Integer> mp = new HashMap<String, Integer>() 
	{{ 
		put("Dark Chocolate", 0); put("Gems", 0); put("Coffee", 0); put("Jamun", 0); put("Modak", 0); put("Kulfi", 0);
	}};
	//main method
	public static void main(String args[]) {
		//creating sweet objects
		Sweet jamun = new Sweet();
		jamun.setWeight(30);
		Sweet modak = new Sweet();
		modak.setWeight(45);
		Sweet kulfi = new Sweet();
		kulfi.setWeight(25);
		DarkChocolate dc = new DarkChocolate();
		Gems g = new Gems();
		Coffee c = new Coffee();
		//taking input from user
		char areMore = 'y';
		System.out.println("\n1. Dark Chocolate\n2. Gems\n3. Coffee\n4. jamun\n5. rasgulla\n6. kalakhand");
		while (areMore == 'y') {
			System.out.println("Select what you find: ");
	        int n = scan.nextInt();
	        switch(n) {
	        case 1: mp.put("Dark Chocolate", mp.get("Dark Chocolate")+1); break;
	        case 2: mp.put("Gems", mp.get("Gems")+1); break;
	        case 3: mp.put("Coffee", mp.get("Coffee")+1); break;
	        case 4: mp.put("Jamun", mp.get("Jamun")+1); break;
	        case 5: mp.put("Modak", mp.get("Modak")+1); break;
	        case 6: mp.put("Kulfi", mp.get("Kulfi")+1); break;
	        }
	        System.out.println("Are there more sweets or chocolates? (y/n): ");
	        areMore = scan.next().charAt(0);
		}
		scan.close();
		//calculating total weight and number of candies
		double totalWt = dc.calcWeight(mp.get("Dark Chocolate")) + g.calcWeight(mp.get("Gems")) + c.calcWeight(mp.get("Coffee"));
		totalWt += kulfi.calcWeight(mp.get("Kulfi")) + modak.calcWeight(mp.get("Modak")) + jamun.calcWeight(mp.get("Jamun"));
		System.out.println("Total gift weight: " + totalWt);
		int quantity = 0;
		System.out.println("Number of individual candies: ");
		for (String candy : mp.keySet()) {
			System.out.println(candy + " : " + mp.get(candy));
			quantity += mp.get(candy);
		}
		System.out.println("Total number of candies: " + quantity);
	}
}
