package basic;

import java.util.Scanner;

public class PrintInuput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter input :");
	if(scn.hasNextInt()){
		int in = scn.nextInt();
		System.out.println("Enter input is integer: " +in);
		
	}
	else if(scn.hasNext()){
		String str = scn.nextLine();
		System.out.println("Enter input is Scanner: " +str);

	}

}
	}
