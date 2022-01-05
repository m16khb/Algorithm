package chapter01;

public class Min3 {
	static int min3(int a, int b, int c) {
		int min = a;
		if (b < min)
			min = b;

		if (c < min)
			min = c;

		return min;
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("min(3,1,5) = " + min3(3, 1, 5));
	}

}
