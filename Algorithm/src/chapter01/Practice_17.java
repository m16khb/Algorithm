package chapter01;

import java.util.Scanner;

public class Practice_17 {
	public static void main(String[] args) {
		System.out.print("몇 단 삼각형입니까? : ");
		Scanner s = new Scanner(System.in);
		int dan = s.nextInt();

		npira(dan);
		s.close();
	}

	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i - 1) * 2 + 1; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
