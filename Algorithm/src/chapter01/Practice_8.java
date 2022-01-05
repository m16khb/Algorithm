package chapter01;

import java.util.Scanner;

public class Practice_8 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner s = new Scanner(System.in);
		System.out.print("몇까지 더할까요? ");
		int n = s.nextInt();

		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);
		System.out.println("합은 : " + sum);

		s.close();
	}

}
