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
		System.out.print("원화를 입력하세요(단위 원)>>");
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
		System.out.println("각 화폐의 개수는 다음과 같습니다.");
		System.out.printf("오만원권 : %d장\n",fiftyThousand);
		System.out.printf("만원권 : %d장\n",tenThousand);
		System.out.printf("오천원권 : %d장\n",fiveThousand);
		System.out.printf("천원권 : %d장\n",oneThousand);
		System.out.printf("오백원권 : %d장\n",fiveHundred);
		System.out.printf("백원권 : %d장\n",oneHundred);
		System.out.printf("오십원권 : %d장\n",fifty);
		System.out.printf("십원권 : %d장\n",ten);
		System.out.printf("일원권 : %d장\n",one);
	
	}

}
