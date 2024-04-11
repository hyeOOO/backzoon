package Bronze;

import java.util.Scanner;

public class Backjoon1978 {
	private boolean isPrime(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i * i <= n; i++) {
			if(n%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Backjoon1978 M = new Backjoon1978();
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		sc.nextLine();

		int count = 0;

		while (input > 0) {
			int num = sc.nextInt();
			if(M.isPrime(num)) count++;
			input--;
		}

		System.out.println(count);
	}
}
