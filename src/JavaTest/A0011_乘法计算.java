package JavaTest;

public class A0011_乘法计算 {
	
	public static void main(String[] args) {

		A0011_乘法计算 test = new A0011_乘法计算();
		
		test.九九表("1");
		test.九九表("2");
		
	}

	public void 九九表(String value) {

		int result = 0;

		if (value.equals("1")) {
			for (int j = 1; j <= 9; j++) {
				result = 1 * j;
				System.out.print(result + " ");
			}
			System.out.println("");
		}

		if (value.equals("2")) {
			for (int j = 1; j <= 9; j++) {
				result = 2 * j;
				System.out.print(result + " ");
			}
			System.out.println("");
		}

		if (value.equals("3")) {
			for (int j = 1; j <= 9; j++) {
				result = 3 * j;
				System.out.print(result + " ");
			}
			System.out.println("");
		}

		if (value.equals("4")) {
			for (int j = 1; j <= 9; j++) {
				result = 4 * j;
				System.out.print(result + " ");
			}
			System.out.println("");
		}

		if (value.equals("5")) {
			for (int j = 1; j <= 9; j++) {
				result = 5 * j;
				System.out.print(result + " ");
			}
			System.out.println("");
		}

		if (value.equals("6")) {
			for (int j = 1; j <= 9; j++) {
				result = 6 * j;
				System.out.print(result + " ");
			}
			System.out.println("");
		}

		if (value.equals("7")) {
			for (int j = 1; j <= 9; j++) {
				result = 7 * j;
				System.out.print(result + " ");
			}
			System.out.println("");
		}

		if (value.equals("8")) {
			for (int j = 1; j <= 9; j++) {
				result = 8 * j;
				System.out.print(result + " ");
			}
			System.out.println("");
		}

		if (value.equals("9")) {
			for (int j = 1; j <= 9; j++) {
				result = 9 * j;
				System.out.print(result + " ");
			}
			System.out.println("");
		}

		if (value.equals("all")) {
			for (int i = 1; i <= 9; i++) {
				for (int j = 1; j <= 9; j++) {
					result = i * j;
					System.out.print(result + " ");
				}
				System.out.println("");
			}

		}

	}

}
