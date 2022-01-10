package chapter02;

import java.util.Scanner;

public class MaxOfArray {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수 : ");
		int num = s.nextInt();

		int[] height = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("height[" + i + "] : ");
			height[i] = s.nextInt();
		}

		System.out.printf("최댓값은 %d입니다.", maxOf(height));
	}

}
