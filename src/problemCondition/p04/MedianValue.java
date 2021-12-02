package problemCondition.p04;

import java.util.Scanner;

public class MedianValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요");
		String inputData1 = scanner.nextLine();
		System.out.print("두번째 숫자를 입력하세요");
		String inputData2 = scanner.nextLine();
		System.out.print("세번째 숫자를 입력하세요");
		String inputData3 = scanner.nextLine();
		int firstNumber = Integer.parseInt(inputData1);
		int secondNumber = Integer.parseInt(inputData2);
		int thirdNumber = Integer.parseInt(inputData3);
		
		if((firstNumber >= secondNumber&&secondNumber>=thirdNumber)||(thirdNumber>=secondNumber && secondNumber>=firstNumber)) {
			System.out.println("중간값은 "+secondNumber+"입니다.");
			
		} else if((firstNumber <= secondNumber&&firstNumber>=thirdNumber)||(thirdNumber>=firstNumber && secondNumber<=firstNumber)) {
			System.out.println("중간값은 "+firstNumber+"입니다.");
		} else {
			System.out.println("중간값은 "+thirdNumber+"입니다.");
		}

	}

}
