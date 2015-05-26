package JavaTest;

public class A0020_银行账号 {

	public static void main(String[] args) {
		A0020_银行账号 test = new A0020_银行账号();
		test.method();
	}

	public void method() {

		// Bank Info
		String rnd = String.format("%08d", new java.util.Random().nextInt(99999999));
		int rt = Integer.parseInt(rnd);

		int n1 = rt % 10 * 7;
		rt = rt / 10;
		int n2 = rt % 10 * 3;
		rt = rt / 10;
		int n3 = rt % 10 * 1;
		rt = rt / 10;
		int n4 = rt % 10 * 7;
		rt = rt / 10;
		int n5 = rt % 10 * 3;
		rt = rt / 10;
		int n6 = rt % 10 * 1;
		rt = rt / 10;
		int n7 = rt % 10 * 7;
		rt = rt / 10;
		int n8 = rt % 10 * 3;
		rt = rt / 10;
		int n9 = 10 - (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8) % 10;

		String routingNumber = "" + rnd + "" + n9;

		System.out.println(routingNumber);

	}

}
