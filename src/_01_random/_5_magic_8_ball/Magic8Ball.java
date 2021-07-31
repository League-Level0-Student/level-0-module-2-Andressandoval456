//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
	public static void main(String[] args) {
	// 2. Get the user to enter a question for the 8 ball to answer
	JOptionPane.showInputDialog("What is your question");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
	Random ran=new Random();
	int number = 0;
	for (int i=0; i<1; i++) {
		number = ran.nextInt(3+0);
//		System.out.println(number);
	}
	// 4. If the random number is 0
	// -- tell the user "Yes"
	if(number==0) {
		System.out.println("yes");
	}
	
	// 5. If the random number is 1
	// -- tell the user "No"
	if(number==1) {
		System.out.println("no");
	}
	
	// 6. If the random number is 2
	// -- tell the user "Maybe you should ask Google?"
	if(number==2) {
		System.out.println("Maybe you should ask Google");
	}
	
	// 7. If the random number is 3
	// -- write your own answer
	if(number==3)
		System.out.println("write your own answer");
}
		
}
