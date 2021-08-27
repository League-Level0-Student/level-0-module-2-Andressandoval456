package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class randomnumbers {
	public static void main(String[] args) {
		
	Random ran=new Random();
	int num1 = 0;
	int num2 = 0;
	int num3 = 0;
	int num4 = 0;
	int num5 = 0;
	int num6 = 0;
	
		num1=ran.nextInt(10)+1;
		num2=ran.nextInt(10)+1;
		num3=ran.nextInt(10)+1;
		num4=ran.nextInt(10)+1;
		num5=ran.nextInt(10)+1;
		num6=ran.nextInt(10)+1;
		
	JOptionPane.showMessageDialog(null, num1+", "+num2+", "+num3+", "+num4+", "+num5+", "+num6 );
	
	}	

}
