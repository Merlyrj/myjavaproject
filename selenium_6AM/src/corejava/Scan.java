package corejava;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		// give inputs at runtime using Scanner function
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		System.out.println("*-*-*-*-*-*-*-*-*--*");
		System.out.println("Addition: "+(a + b));
		System.out.println("SUB: "+(a - b));		
		System.out.println("MUL: "+(a * b));


	}

}
