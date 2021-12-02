package problemLoop.p02;

import java.util.Scanner;

public class TypeOfAlphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i =1;
		while(i<=5) {
			System.out.print("알파벳 하나를 입력하시오>>");
			String inputData = scanner.next();
			char c = inputData.charAt(0);
			
			if(c<97&&c>64) {
				System.out.println(c+"는 대문자입니다.");
			} else if(c<123){
				System.out.println(c+"는 소문자입니다.");
						
			} else {
				System.out.println(c+"의 타입은 알 수 없습니다.");
			}
			i++;
		}
	}

}
