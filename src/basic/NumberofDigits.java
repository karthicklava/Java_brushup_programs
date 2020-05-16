package basic;
public class NumberofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11234;
		int count=0;
		
		for(;num!=0;){
			num=num/10;
			count++;
		
		}
System.out.println(count);


//method 2
	int num1=1;
	int count1=0;
	while(num1!=0){
		num1=num1/10;
		count1++;
	}
	System.out.println(count1);





	}

	
}
