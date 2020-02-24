package Lab1;

import java.util.Scanner;

public class CalculateSum {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		CalculateSum sum = new CalculateSum();
		int s = sum.calculateSum(n);
		System.out.print(s);
		sc.close();
	}

	int calculateSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}
}
