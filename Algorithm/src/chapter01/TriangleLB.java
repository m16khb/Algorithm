package chapter01;

import java.util.Scanner;

public class TriangleLB {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형입니까? : ");
		Scanner s = new Scanner(System.in);
		int dan = s.nextInt();
		
		for (int i = 0; i < dan; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
