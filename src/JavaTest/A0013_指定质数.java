package JavaTest;

public class A0013_指定质数 {

	public static void main(String[] args) {

		A0013_指定质数 test = new A0013_指定质数();
		// test.指定范围(10);
		test.指定数量(100);

	}

	public void 指定范围(int n) {

		for (int i = 2; i <= n; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.print(i + " ");
			}
		}

	}

	public void 指定数量(int s) {

		int count = 0;

		for (int i = 2; count < s; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime == true) {
				System.out.println("第" + (count + 1) + "个质数是： " + i);
				count++;
			}
		}

	}

}
