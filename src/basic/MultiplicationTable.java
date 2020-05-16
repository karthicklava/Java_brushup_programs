package basic;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		int num=13;
		int value =0;
		
		for(int i=1;i<=10;i++){
			value=num*i;
			System.out.println("Multiply table of " +num+"* " +i+ "=" +value);
		}
	}

}

