package JavaTest;

public class A0014_������� {

	public static void main(String[] args) {
		A0014_������� test = new A0014_�������();
		test.����(2);
		test.����(2);
	}

	public void ����(int n) {

		double sum = 0.0;

		for (int i = 1; i <= n; i++) {
			sum += 1.0 / i;
		}

		System.out.printf("%.2f", sum);
		System.out.println();
		System.out.println(sum);

	}

	public void ����(int n) {

		double sum = 0.0;
		// int sign = 1;

		for (int i = 1; i <= n; i++) {
			// sum += sign * 1.0 / i;
			// sign = -sign;

			if (i % 2 == 1) {
				sum += 1.0 / i;
			} else {
				sum -= 1.0 / i;
			}

		}

		System.out.printf("%.2f", sum);
		System.out.println();
		System.out.println(sum);

	}

}
