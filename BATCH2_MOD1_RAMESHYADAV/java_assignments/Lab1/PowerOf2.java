package Lab1;

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String args[]) {
		int n;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		PowerOf2 num = new PowerOf2();
		boolean check = num.checkNumber(n);
		System.out.println(check);
	}

	boolean checkNumber(int n) {
		int rem;
		while (n >= 2) {
			rem = n % 2;
			if (rem == 0) {
				n = n / 2;
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
}
