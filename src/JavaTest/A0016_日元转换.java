package JavaTest;

public class A0016_��Ԫת�� {

	public static void main(String[] args) {
		A0016_��Ԫת�� test = new A0016_��Ԫת��();
		test.cny(30.3094);
		test.jpy(1860);
	}

	public void cny(double c) {
		double j = c * 19.7750;
		System.out.println("�����" + c + "Ԫ������Ԫ" + j + "Ԫ��");
	}

	public void jpy(double j) {
		double c = j * 0.0506;
		System.out.println("��Ԫ" + j + "Ԫ���������" + c + "Ԫ��");
	}

}
