package JavaTest;

public class A0016_日元转换 {

	public static void main(String[] args) {
		A0016_日元转换 test = new A0016_日元转换();
		test.cny(30.3094);
		test.jpy(1860);
	}

	public void cny(double c) {
		double j = c * 19.7750;
		System.out.println("人民币" + c + "元等于日元" + j + "元。");
	}

	public void jpy(double j) {
		double c = j * 0.0506;
		System.out.println("日元" + j + "元等于人民币" + c + "元。");
	}

}
