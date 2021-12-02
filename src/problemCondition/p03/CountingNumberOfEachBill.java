package problemCondition.p03;

import java.util.Scanner;

public class CountingNumberOfEachBill {

	public static void main(String[] args) {
		int fiftyThousand = 0;
		int tenThousand = 0;
		int fiveThousand = 0;
		int oneThousand = 0;
		int fiveHundred = 0;
		int oneHundred = 0;
		int fifty = 0;
		int ten = 0;
		int one = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		String inputData = scanner.nextLine();
		int exchange = Integer.parseInt(inputData); 
		if(exchange>=50000) {
			fiftyThousand = exchange/50000;
			exchange = exchange%50000;
		} 
		if(exchange>=10000) {
			tenThousand = exchange/10000;
			exchange = exchange%10000;
		}
		if(exchange>=5000) {
			fiveThousand = exchange/5000;
			exchange = exchange%5000;
		}
		if(exchange>=1000) {
			oneThousand = exchange/1000;
			exchange = exchange%1000;
		}
		if(exchange>=500) {
			fiveHundred = exchange/500;
			exchange = exchange%500;
		}
		if(exchange>=100) {
			oneHundred = exchange/100;
			exchange = exchange%100;
		}
		if(exchange>=50) {
			fifty = exchange/50;
			exchange = exchange%50;
		}
		if(exchange>=10) {
			ten = exchange/10;
			exchange = exchange%10;
		} else {
			one = exchange;
		}
		System.out.println("�� ȭ���� ������ ������ �����ϴ�.");
		System.out.printf("�������� : %d��\n",fiftyThousand);
		System.out.printf("������ : %d��\n",tenThousand);
		System.out.printf("��õ���� : %d��\n",fiveThousand);
		System.out.printf("õ���� : %d��\n",oneThousand);
		System.out.printf("������� : %d��\n",fiveHundred);
		System.out.printf("����� : %d��\n",oneHundred);
		System.out.printf("���ʿ��� : %d��\n",fifty);
		System.out.printf("�ʿ��� : %d��\n",ten);
		System.out.printf("�Ͽ��� : %d��\n",one);
	
	}

}
