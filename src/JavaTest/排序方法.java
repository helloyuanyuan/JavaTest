package JavaTest;

public class ���򷽷� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 3, 2, 1 };
		int[] b = { 4, 3, 2, 1 };
		ֱ������(a);
		ð������(b);
	}

	public static void ֱ������(int[] s) {
		System.out.println("");
		int temp;
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i] > s[j]) {
					temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
			System.out.print("��" + (i + 1) + "��������:");
			for (int a = 0; a < s.length; a++) {
				System.out.print(s[a] + "\t");
			}
			System.out.println("");
		}
		System.out.print("���� ������:");
		for (int a = 0; a < s.length; a++) {
			System.out.print(s[a] + "\t");
		}
	}

	public static void ð������(int[] s) {
		System.out.println("");
		int temp;
		for (int i = 0; i <= s.length; i++) {
			for (int j = 0; j < s.length - 1; j++) {
				if (s[j] > s[j + 1]) {
					temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;
				}
			}
			System.out.print("��" + (i + 1) + "��������:");
			for (int a = 0; a < s.length; a++) {
				System.out.print(s[a] + "\t");
			}
			System.out.println("");
		}
		System.out.print("���� ������:");
		for (int a = 0; a < s.length; a++) {
			System.out.print(s[a] + "\t");
		}
	}
}
