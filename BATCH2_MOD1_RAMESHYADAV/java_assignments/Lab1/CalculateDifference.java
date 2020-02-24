package Lab1;

import java.util.Scanner;

public class CalculateDifference {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		CalculateDifference difference = new CalculateDifference();
		int diff=difference.calculateDifference(n);
		System.out.println("The Difference between sum of squares and square of sum is:"+diff);
		sc.close();
	}

	int calculateDifference(int n) {
		int sum1 = 0,sum2=0,sum;
		for(int i=1;i<=n;i++) {
			sum1=sum1+i*i;
			sum2=sum2+i;
		}
		sum=sum1-(sum2*sum2);
		return sum;
	}
}
