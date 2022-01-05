package chapter01;

import java.util.Scanner;

public class Practice_11 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		Scanner s = new Scanner(System.in);
		System.out.print("n을 입력해주세요 : ");
		int n = s.nextInt();
		int size = 0;
		while (n != 0) {
			n /= 10;
			size++;
		}

		System.out.println("그 수는 " + size + "자리입니다.");
	}

}
