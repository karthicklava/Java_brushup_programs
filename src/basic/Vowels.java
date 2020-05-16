package basic;
import java.util.Scanner;


public class Vowels {

	public static void main(String[] args) {

		
		Scanner scn = new Scanner(System.in);
		char vm = scn.next().charAt(0);
//method 1 using switch case
		switch (vm) {
		case 'a':

		case 'e':

		case 'i':

		case 'o':

		case 'u':
			

			System.out.println("The Entered character is vowel");
			break;
		default:
			System.out.println("The Entered character not a vowel");
		}
		
		//method 2 using if condition
		
		if(vm=='a'||vm=='e'||vm=='i'||vm=='o'||vm=='u'){
			System.out.println("Method 2 output");
			System.out.println("The Entered character is vowel");
			
		}
		else{
			System.out.println("Method 2 output");
			System.out.println("The Entered character not a vowel");
		}


	}

}
