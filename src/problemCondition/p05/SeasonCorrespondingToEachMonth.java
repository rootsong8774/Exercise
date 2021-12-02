package problemCondition.p05;

import java.util.Scanner;

public class SeasonCorrespondingToEachMonth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		String inputData = scanner.nextLine();
		int month = Integer.parseInt(inputData);
		switch(month%12/3) {
		case 0:
			System.out.println(month +"월은 겨울입니다.");
			break;
		case 1:
			System.out.println(month +"월은 봄입니다.");
			break;
		case 2:
			System.out.println(month +"월은 여름입니다.");
			break;
		case 3:
			System.out.println(month +"월은 가을입니다.");
			break;
		}
		

	}

}
