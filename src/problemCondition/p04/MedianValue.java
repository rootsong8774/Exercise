package problemCondition.p04;

import java.util.Scanner;

public class MedianValue {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���");
		String inputData1 = scanner.nextLine();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���");
		String inputData2 = scanner.nextLine();
		System.out.print("����° ���ڸ� �Է��ϼ���");
		String inputData3 = scanner.nextLine();
		int firstNumber = Integer.parseInt(inputData1);
		int secondNumber = Integer.parseInt(inputData2);
		int thirdNumber = Integer.parseInt(inputData3);
		
		if((firstNumber >= secondNumber&&secondNumber>=thirdNumber)||(thirdNumber>=secondNumber && secondNumber>=firstNumber)) {
			System.out.println("�߰����� "+secondNumber+"�Դϴ�.");
			
		} else if((firstNumber <= secondNumber&&firstNumber>=thirdNumber)||(thirdNumber>=firstNumber && secondNumber<=firstNumber)) {
			System.out.println("�߰����� "+firstNumber+"�Դϴ�.");
		} else {
			System.out.println("�߰����� "+thirdNumber+"�Դϴ�.");
		}

	}

}
