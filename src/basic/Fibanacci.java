package basic;

public class Fibanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 10;
		int f1=0;
		int f2=1;
		int sum =0;
		for(int i=1;i<=num;i++){
			System.out.println(f1);
			sum=f1+f2;
			f1=f2;
			f2=sum;
			
		}
		

	}

}

