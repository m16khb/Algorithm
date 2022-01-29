package chapter02;

public class Practice_5 {

	public static void copy(int[] a, int[] b) {
		if(a.length == b.length) {
			for (int i = 0; i < b.length; i++) {
				a[i] = b[b.length - 1 - i];
			}
		}
	}

}
