package chapter01;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("2자리의 정수를 입력하세요.");
		Scanner s = new Scanner(System.in);
		int no = 0;
		do {
			System.out.print("입력 : ");
			no = s.nextInt();
		}while(!(100> no && no >=10));
		System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");
	}

}
