package chapter01;

import java.util.Scanner;

public class Practice_10 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner s = new Scanner(System.in);
		System.out.print("a의 값 : ");
		int a = s.nextInt();

		System.out.print("b의 값 : ");
		int b = s.nextInt();
		while (b <= a) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b의 값 : ");
			b = s.nextInt();
		}

		System.out.println("b - a는 " + (b - a) + "입니다.");
	}

}
