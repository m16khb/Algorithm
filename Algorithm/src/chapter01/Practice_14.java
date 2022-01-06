package chapter01;

import java.util.Scanner;

public class Practice_14 {
	public static void main(String[] args) {
		System.out.println("사각형을 출렵합니다.");
		Scanner s = new Scanner(System.in);
		int dan = s.nextInt();

		for (int i = 0; i < dan; i++) {
			for (int j = 0; j < dan; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
