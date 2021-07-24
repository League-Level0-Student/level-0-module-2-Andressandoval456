//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		int complimentNumber = 0;
		// 1. Use each value of randomNumber to give the user a random compliment.
		for(int i=0; i<10; i++) {
			complimentNumber = randomMaker.nextInt(5)+1;
				if (complimentNumber == 1) {
					System.out.println("You are nice");
		}		
				if (complimentNumber == 2) {
					System.out.println("You look good");
		}
				if (complimentNumber == 3) {
					System.out.println("Compliment 3");
		}
				if (complimentNumber == 4) {
					System.out.println("Compliment 4");
		}
				if (complimentNumber == 5) {
					System.out.println("Compliment 5");
		}
	}		
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
