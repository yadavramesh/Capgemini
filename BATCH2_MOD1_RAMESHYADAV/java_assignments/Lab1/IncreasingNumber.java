package Lab1;

import java.util.Scanner;

public class IncreasingNumber {
	public static void main(String args[]) {
		int n;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		IncreasingNumber num = new IncreasingNumber();
		boolean check = num.checkNumber(n);
		System.out.println(check);
	}

	boolean checkNumber(int n) {
		int x, y;
		while (n > 0) {
			x = n % 10;
			y = (n / 10) % 10;

			if (x >= y) {
				n = n / 10;
				continue;
			} else {
				return false;
			}

		}
		return true;
	}
}
