package JavaTest;

import java.util.Scanner;

public class �Զ���Ʊ {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int station = 0;
		int price = 0;
		int count = 1;
		String stationName = null;

		while (price == 0) {
			System.out.println("���ã����ǽ���ĵ�" + count + "λ�˿ͣ���ѡ����Ҫȥ��վ�㣺 ");
			System.out.println("��һվ���������� - 1��");
			System.out.println("�ڶ�վ���츮�㳡 - 2��");
			System.out.println("����վ����  ��  · - 3��");
			System.out.print("�����룺 ");

			station = in.nextInt();

			switch (station) {
			case 1:
				price = 1;
				stationName = "��������";
				break;
			case 2:
				price = 2;
				stationName = "�츮�㳡";
				break;
			case 3:
				price = 3;
				stationName = "��  ��  ·";
				break;
			default:
				price = 0;
				System.err.println("�������վ���������������룡");
				break;
			}

			if (price > 0) {
				System.out.println("��Ҫȥ: " + stationName + "�� Ʊ���ǣ� " + price + "Ԫ��");

				int banlance = 0;

				while (banlance < price) {
					System.out.print("��Ͷ��: ");
					int amount = in.nextInt();
					banlance += amount;
					if (banlance >= price) {
						int change = banlance - price;
						System.out.println("��Ͷ���ˣ� " + banlance + "Ԫ��Ӧ���㣺 " + change + "Ԫ��");
						System.out.println("���ú����ĳ�Ʊ������ʧ��");
						System.out.println("**************************");
						System.out.println("*       վ����" + stationName + " վ" + "                *");
						System.out.println("*       Ʊ�ۣ�" + price + " Ԫ" + "                           *");
						System.out.println("**************************");
						System.out.println("���㣺 " + change + "Ԫ��");
						System.out.println("��������������������������������������������������������������������������������������������������������������������������������������������");
					} else {
						System.out.println("��Ͷ��Ľ���ǣ� " + banlance + "Ԫ����ӦͶ�룺 " + (price - banlance) + "Ԫ��");
					}

				}
				banlance = 0;
				price = 0;
				count++;
			}
		}

	}

}
