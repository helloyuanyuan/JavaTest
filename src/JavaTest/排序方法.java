package JavaTest;

public class 排序方法 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 3, 2, 1 };
		int[] b = { 4, 3, 2, 1 };
		直接排序(a);
		冒泡排序(b);
	}

	public static void 直接排序(int[] s) {
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
			System.out.print("第" + (i + 1) + "次排序结果:");
			for (int a = 0; a < s.length; a++) {
				System.out.print(s[a] + "\t");
			}
			System.out.println("");
		}
		System.out.print("最终 排序结果:");
		for (int a = 0; a < s.length; a++) {
			System.out.print(s[a] + "\t");
		}
	}

	public static void 冒泡排序(int[] s) {
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
			System.out.print("第" + (i + 1) + "次排序结果:");
			for (int a = 0; a < s.length; a++) {
				System.out.print(s[a] + "\t");
			}
			System.out.println("");
		}
		System.out.print("最终 排序结果:");
		for (int a = 0; a < s.length; a++) {
			System.out.print(s[a] + "\t");
		}
	}
}
