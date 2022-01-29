package chapter02;

public class Practice_4 {

	public static void copy(int[] a, int[] b) {
		if(a.length == b.length) {
			for (int i = 0; i < b.length; i++) {
				a[i] = b[i];
			}
		}
	}

}
