package problemArray.q02;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1}; // 환산할 돈의 종류
		int[] numOfBills = new int[unit.length];
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하세요.(단위 원)>>");
		int money = scanner.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			numOfBills[i] = (int) (money / unit[i]);
			money = money%unit[i];
			System.out.println(unit[i]+"원권: "+numOfBills[i]);
		}
		
	}

}
