package chapter01;

public class Min4 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if (b < min)
			min = b;
		if (c < min)
			min = c;
		if (d < min)
			min = d;
		return min;
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("min(3,2,1,5) = " + min4(3, 2, 1, 5));
	}

}
