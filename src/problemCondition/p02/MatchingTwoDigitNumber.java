package problemCondition.p02;

import java.util.Scanner;

public class MatchingTwoDigitNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("10~99 ������ ������ �Է��ϼ���.");
		String inputData = scanner.nextLine();
		int num = Integer.parseInt(inputData);
			if(num/10 == num%10) {
				System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
			} else {
				System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
			}
			
		
	}

}
