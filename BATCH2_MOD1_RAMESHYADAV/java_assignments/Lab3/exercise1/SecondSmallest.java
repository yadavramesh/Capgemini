package Lab3.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int array[]=new int[size];
		System.out.println("Insert Elements in Array");
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		SecondSmallest ss=new SecondSmallest();
		int second=ss.getSecondSmallest(array);
		System.out.println("\n "+second);
	}
	 int getSecondSmallest(int[] array) {
		Arrays.sort(array);
		return array[1];
	}
	

}
