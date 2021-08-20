package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class randomnumbers {
	public static void main(String[] args) {
		
	Random ran=new Random();
	int num1 = 0;
	int num2 = 0;
	
	
	
	
	for (int i=0; i<1; i++) {
		num1=ran.nextInt(10)+1;

	}
	JOptionPane.showMessageDialog(null, num1+", " );
	
	}	

}
