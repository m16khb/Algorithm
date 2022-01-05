package chapter01;

import java.util.Scanner;

public class Prractice_9 {

	static int sumof(int a, int b) {
		if (a >= b) {
			int tmp = b;
			b = a;
			a = tmp;
		}
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner s = new Scanner(System.in);
		System.out.print("a와 b를 입력해 주세요 : ");
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println(a + "부터 " + b + "까지의 합은 " + sumof(a, b) + "입니다.");
		s.close();
	}

}
