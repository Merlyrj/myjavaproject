package corejava;
import java.util.Scanner;
import java.util.Iterator;
import java.util.Random;

public class Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;

		// give inputs at runtime using Scanner function
		Scanner s = new Scanner(System.in);
		
		a = s.nextInt();
		Random abc = new Random();
		int myRandomNumber = abc.nextInt(100);
		System.out.println(myRandomNumber);
		System.out.println("*--*-*-*-*-*-*-*-*-*-*-*");
		//Print three random numbers
		for (int i = 0; i < 3; i++) {
			int myRandomNumber1 = abc.nextInt(8);
			System.out.println(myRandomNumber1);
		
	}

	
	}}


