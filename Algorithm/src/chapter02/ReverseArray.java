package chapter02;

import java.util.Scanner;

public class ReverseArray {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - 1 - i);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = s.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			arr[i] = s.nextInt();
		}

		System.out.println("요소를 역순으로 정렬했습니다.");
		reverse(arr);
		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : " + arr[i]);
		}

	}

}
