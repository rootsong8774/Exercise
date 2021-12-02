package problemArray.q08;

import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		String com[] = { "가위", "바위", "보" }; // "가위", "바위", "보" 문자열을 가진 배열

		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다. (종료:q)");
			
			String opponent = com[(int) (Math.random()*3)];
			String me = scanner.next();
			if(me.equals("q")) {
				break;
			}
			if(!me.equals(com[0])&&!me.equals(com[1])&&!me.equals(com[2])) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			if(me.equals(opponent)) {
				System.out.println("비겼습니다.");
			} else if ((me.equals("가위")&&opponent.equals("보"))||(me.equals("바위")&&opponent.equals("가위"))||(me.equals("보")&&opponent.equals("바위"))) {
				System.out.println("당신이 이겼습니다.");
			} else {
				System.out.println("상대가 이겼습니다.");
			}
		}
		
		
		

	}

}
