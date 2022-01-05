package chapter01;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner s = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = s.nextInt();

		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += (i + 1);
		}
		
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		s.close();
	}

}
