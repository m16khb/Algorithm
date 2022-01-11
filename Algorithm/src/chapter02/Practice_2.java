package chapter02;

public class Practice_2 {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] arr = { 5, 10, 73, 2, -5, 42 };
		System.out.println(sumOf(arr));
	}

}
