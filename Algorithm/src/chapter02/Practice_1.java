package chapter02;

import java.util.Random;
import java.util.Scanner;

public class Practice_1 {
	static int maxOf(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");
		
		int[] height = new int[r.nextInt(10)+1];
		
		System.out.println("키 값은 아래와 같습니다.");
		for (int i = 0; i < height.length; i++) {
			height[i] = 100 + r.nextInt(90);
			System.out.print("height[" + i + "] : " + height[i] + "\n");
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
	}

}
