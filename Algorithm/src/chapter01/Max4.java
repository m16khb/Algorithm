package chapter01;

public class Max4 {
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if (b > max)
			max = b;
		if (c > max)
			max = c;
		if (d > max)
			max = d;
		return max;
	}

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		System.out.println("max(3,2,1,5) = " + max4(3, 2, 1, 5));
	}

}
