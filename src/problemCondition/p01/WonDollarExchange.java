package problemCondition.p01;

import java.util.Scanner;

public class WonDollarExchange {

	public static void main(String[] args) {
		final double rate = 1100.0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위 원)>>");
		String won = scanner.nextLine();
		System.out.printf("$ %.2f", Integer.parseInt(won) / rate); 
	}

}
