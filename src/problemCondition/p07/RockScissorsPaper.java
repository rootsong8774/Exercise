package problemCondition.p07;

import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 키보드 입력을 위한 Scanner 객체 생성 		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.print("철수 >> ");
		String a = scanner.next(); // 철수의 가위, 바위, 보, 문자열을  입력받는다.
		System.out.print("영희 >> ");
		String b= scanner.next(); // 영희의 가위, 바위, 보, 문자열을 입력받는다.
		if(a.equals(b)) {
			System.out.println("비겼습니다.");
		} else if ((a.equals("가위")&&b.equals("보"))||(a.equals("바위")&&b.equals("가위"))||(a.equals("보")&&b.equals("바위"))) {
			System.out.println("철수가 이겼습니다.");
		} else {
			System.out.println("영희가 이겼습니다.");
		}
	}

}
