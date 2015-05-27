package JavaTest;

public class A0018_Ð¡Ð´¶ÁÊý {

	public static void main(String[] args) {
		A0018_Ð¡Ð´¶ÁÊý test = new A0018_Ð¡Ð´¶ÁÊý();
		test.method(-12345);
	}

	public void method(int input) {

		int rang = 100000;

		if (input >= rang || input <= -rang) {
			System.out.println("ÄúÊäÈëµÄ: " + input + " ³¬³öÁË·¶Î§¡£ÇëÊäÈë -" + rang + " ~ " + rang + " Ö®¼äµÄÕûÊý£¡");
		}

		else {

			int output;

			if (input < 0) {
				System.out.print("¸º ");
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
						System.out.print("Áã ");
						break;
					case 1:
						System.out.print("Ò¼ ");
						break;
					case 2:
						System.out.print("·¡ ");
						break;
					case 3:
						System.out.print("Èþ ");
						break;
					case 4:
						System.out.print("ËÁ ");
						break;
					case 5:
						System.out.print("Îé ");
						break;
					case 6:
						System.out.print("Â½ ");
						break;
					case 7:
						System.out.print("Æâ ");
						break;
					case 8:
						System.out.print("°Æ ");
						break;
					case 9:
						System.out.print("¾Á ");
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
						System.out.print("Áã ");
						break;
					case 1:
						System.out.print("Ò¼ ");
						break;
					case 2:
						System.out.print("·¡ ");
						break;
					case 3:
						System.out.print("Èþ ");
						break;
					case 4:
						System.out.print("ËÁ ");
						break;
					case 5:
						System.out.print("Îé ");
						break;
					case 6:
						System.out.print("Â½ ");
						break;
					case 7:
						System.out.print("Æâ ");
						break;
					case 8:
						System.out.print("°Æ ");
						break;
					case 9:
						System.out.print("¾Á ");
						break;
					}

					input %= temp;
					temp /= 10;
				}

			} else {
				System.out.print("Áã ");
			}

		}

	}

}
