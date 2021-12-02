package problemCondition.p02;

import java.util.Scanner;

public class MatchingTwoDigitNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("10~99 사이의 정수만 입력하세요.");
		String inputData = scanner.nextLine();
		int num = Integer.parseInt(inputData);
			if(num/10 == num%10) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			} else {
				System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
			}
			
		
	}

}
