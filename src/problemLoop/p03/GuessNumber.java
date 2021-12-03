package problemLoop.p03;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int low, high;
		int card; // 카드에 적힌 번호 값(숨기는 값, 정답)
		Random r = new Random(); // 난수 발생기 생성
		card = r.nextInt(100);
		System.out.println();
		Scanner scanner = new Scanner(System.in); // 키보드 입력기 생성
		int chance = 10;
		
		while(true) {
			System.out.println("주어진 기회가 "+chance+" 번 남았습니다.");
			System.out.println("0~99에서 수를 결정하였습니다. 맞추어 보세요");
			String s = scanner.nextLine();
			int trial = Integer.parseInt(s);
			if (trial > card) {
				System.out.println(trial + "보다 낮은 값입니다. 다시 시도하세요");
			} else if (trial < card){
				System.out.println(trial +"보다 높은 값입니다. 다시 시도하세요");
			} else if (trial == card) {
				System.out.println("정답입니다. 프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("범위를 벗어났습니다.");
			}
			chance--;
			if (chance==0) {
				System.out.println("더 이상 기회가 없습니다. 프로그램을 종료합니다.");
				break;
			}
			
		}
	}

}
