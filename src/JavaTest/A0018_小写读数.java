package JavaTest;

public class A0018_Сд���� {

	public static void main(String[] args) {
		A0018_Сд���� test = new A0018_Сд����();
		test.method(-12345);
	}

	public void method(int input) {

		int rang = 100000;

		if (input >= rang || input <= -rang) {
			System.out.println("�������: " + input + " �����˷�Χ�������� -" + rang + " ~ " + rang + " ֮���������");
		}

		else {

			int output;

			if (input < 0) {
				System.out.print("�� ");
				input *= -1;
				int lengthA = String.valueOf(input).length();
				int n = lengthA;
				int temp = 1;

				while (n > 1) {
					temp *= 10;
					n--;
				}
				for (int i = 0; i < lengthA; i++) {
					output = input / temp;

					switch (output) {
					case 0:
						System.out.print("�� ");
						break;
					case 1:
						System.out.print("Ҽ ");
						break;
					case 2:
						System.out.print("�� ");
						break;
					case 3:
						System.out.print("�� ");
						break;
					case 4:
						System.out.print("�� ");
						break;
					case 5:
						System.out.print("�� ");
						break;
					case 6:
						System.out.print("½ ");
						break;
					case 7:
						System.out.print("�� ");
						break;
					case 8:
						System.out.print("�� ");
						break;
					case 9:
						System.out.print("�� ");
						break;
					}

					input %= temp;
					temp /= 10;
				}

			} else if (input > 0) {
				int lengthA = String.valueOf(input).length();
				int n = lengthA;
				int temp = 1;

				while (n > 1) {
					temp *= 10;
					n--;
				}

				for (int i = 0; i < lengthA; i++) {
					output = input / temp;

					switch (output) {
					case 0:
						System.out.print("�� ");
						break;
					case 1:
						System.out.print("Ҽ ");
						break;
					case 2:
						System.out.print("�� ");
						break;
					case 3:
						System.out.print("�� ");
						break;
					case 4:
						System.out.print("�� ");
						break;
					case 5:
						System.out.print("�� ");
						break;
					case 6:
						System.out.print("½ ");
						break;
					case 7:
						System.out.print("�� ");
						break;
					case 8:
						System.out.print("�� ");
						break;
					case 9:
						System.out.print("�� ");
						break;
					}

					input %= temp;
					temp /= 10;
				}

			} else {
				System.out.print("�� ");
			}

		}

	}

}
