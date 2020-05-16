package basic;
import java.util.Scanner;

public class LeapyearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn= new Scanner(System.in);
		int year = scn.nextInt();
		
		boolean leap= false;
		
		if(year%4==0){
			if(year%100==0){
				if(year%400==0){
					leap=true;
				}
				else{
					leap=false;
				}
				
			}
			else{
				leap=true;
			}
			
		}
		else{
			leap=false;
		}
		
		if(leap){
			System.out.println("Is the leap year");
		}
		else{
			System.out.println("its not the leap year");
		}
		
	}

}
