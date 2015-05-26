package JavaTest;

public class A0015_求公约数 {

	public static void main(String[] args) {
		A0015_求公约数 test = new A0015_求公约数();
		// test.method1(12, 24);
		test.method2(1024, 1024);
	}

	public void method1(int a, int b) {

		int gcd = 1;

		for (int i = 2; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		System.out.println(a + "和" + b + "的最大公约数为：" + gcd);
	}

	public void method2(int a, int b) {

		int gcd = 1;
		int temp;
		int aa = a;
		int bb = b;

		while (bb != 0) {
			temp = aa % bb;
			aa = bb;
			bb = temp;
		}

		gcd = aa;
		System.out.println(a + "和" + b + "的最大公约数为：" + gcd);

	}

}
