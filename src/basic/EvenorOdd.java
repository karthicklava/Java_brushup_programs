package basic;
import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		
		
		if(num%2==0){
			System.out.println("The given number is Even");
		}
		else{
			System.out.println("The given number is Odd");
			
		}

	}

}

