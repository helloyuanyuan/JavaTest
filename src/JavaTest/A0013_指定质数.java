package JavaTest;

public class A0013_ָ������ {

	public static void main(String[] args) {

		A0013_ָ������ test = new A0013_ָ������();
		// test.ָ����Χ(10);
		test.ָ������(100);

	}

	public void ָ����Χ(int n) {

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

	public void ָ������(int s) {

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
				System.out.println("��" + (count + 1) + "�������ǣ� " + i);
				count++;
			}
		}

	}

}
