package basic;

import java.util.Arrays;

public class SortArrayInDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={100,300,200,700,500};
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is" + Arrays.toString(arr));

	}

}
