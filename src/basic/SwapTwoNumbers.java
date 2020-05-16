package basic;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Method 1: with third variable
		
		int a = 10;
		int b= 30;
		int temp;
		
		temp=a; //now value of temp will be 10
		a=b; //now value of a will be 30
		b=temp; //now value of b will be 10
		
	System.out.println("Method 1 with 3rd variable output is:");
		System.out.println("Value of a after swap :" +a);
		System.out.println("Value of b after swap :" +b);
		
		
		//Method 2 without 3rd variable
		
		int d=10;
		int f= 30;
		
	   d= d+f;  // now d value will be 60
	   f= d-f; //now f value will be 40
	   d=d-f; //now d value will be 20
	   
		System.out.println("Method 1 without 3rd variable output is:");
		System.out.println("Value of d after swap :" +d);
		System.out.println("Value of f after swap :" +f);
		
				

	}

}
