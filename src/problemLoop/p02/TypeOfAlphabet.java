package problemLoop.p02;

import java.util.Scanner;

public class TypeOfAlphabet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i =1;
		while(i<=5) {
			System.out.print("���ĺ� �ϳ��� �Է��Ͻÿ�>>");
			String inputData = scanner.next();
			char c = inputData.charAt(0);
			
			if(c<97&&c>64) {
				System.out.println(c+"�� �빮���Դϴ�.");
			} else if(c<123){
				System.out.println(c+"�� �ҹ����Դϴ�.");
						
			} else {
				System.out.println(c+"�� Ÿ���� �� �� �����ϴ�.");
			}
			i++;
		}
	}

}
