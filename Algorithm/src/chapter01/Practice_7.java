package chapter01;

import java.util.Scanner;

public class Practice_7 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner s = new Scanner(System.in);
		System.out.print("n을 입력해 주세요 : ");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 0; i < n - 1; i++) {
			System.out.print((i + 1) + " + ");
			sum += (i + 1);
		}
		sum += n;
		System.out.println(n + " = " + sum);
	}

}
