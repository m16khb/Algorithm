package chapter01;

import java.util.Scanner;

public class Practice_15 {
	public static void main(String[] args) {
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형입니까? : ");
		Scanner s = new Scanner(System.in);
		int dan = s.nextInt();
		
		triangleRU(dan);
		s.close();
	}
	
	//왼쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleLB(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//왼쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleLU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < (n - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//오른쪽 위가 직각인 이등변 삼각형을 출력
	static void triangleRU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (n - i); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//오른쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleRB(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
