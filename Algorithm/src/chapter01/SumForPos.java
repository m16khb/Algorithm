package chapter01;

import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("1부터 n까지의 합을 수합니다.");

		do {
			System.out.print("n의 값 : ");
			n = s.nextInt();
		} while (n <= 0);

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}

}
