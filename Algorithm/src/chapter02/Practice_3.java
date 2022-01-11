package chapter02;

public class Practice_3 {
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void reverse(int[] a) {

		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - 1 - i);
			System.out.println("a[" + i + "]과(와) a[" + (a.length - 1 - i) + "]를 교환합니다.");
			for (int num = 0; num < a.length; num++) {
				System.out.print(a[num] + " ");
			}
			System.out.println();
		}
		System.out.println("역순 정렬을 마쳤습니다.");
	}

	public static void main(String[] args) {
		int[] arr = { 5, 10, 73, 2, -5, 42 };
		for (int num = 0; num < arr.length; num++) {
			System.out.print(arr[num] + " ");
		}
		System.out.println();
		reverse(arr);
	}

}
