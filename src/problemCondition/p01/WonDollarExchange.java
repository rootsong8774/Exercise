package problemCondition.p01;

import java.util.Scanner;

public class WonDollarExchange {

	public static void main(String[] args) {
		final double rate = 1100.0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("��ȭ�� �Է��ϼ���(���� ��)>>");
		String won = scanner.nextLine();
		System.out.printf("$ %.2f", Integer.parseInt(won) / rate); 
	}

}
