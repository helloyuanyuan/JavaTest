package JavaTest;

public class A0020_银行账号 {

	public static void main(String[] args) {
		A0020_银行账号 test = new A0020_银行账号();
		test.routingNumber();
	}

	public void routingNumber() {

		String random = String.format("%08d", new java.util.Random().nextInt(99999999));
		int rt = Integer.parseInt(random);
		int length = 10000000;
		int n = 0;
		int tmp;
		int n9;

		for (int k = 0; k < 8; k++) {
			tmp = rt / length;

			switch (k) {
			case 0:tmp *= 3;break;
			case 1:tmp *= 7;break;
			case 2:tmp *= 1;break;
			case 3:tmp *= 3;break;
			case 4:tmp *= 7;break;
			case 5:tmp *= 1;break;
			case 6:tmp *= 3;break;
			case 7:tmp *= 7;break;
			}

			rt = rt % length;
			length = length / 10;
			n += tmp;

		}
		if (n % 10 == 0) {
			n9 = 0;
		} else {
			n9 = 10 - n % 10;
		}

		String routingNumber = "" + random + "" + n9;

		System.out.println(routingNumber);

	}

}
