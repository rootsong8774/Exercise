package chap02sec05.q03;

import java.util.Scanner;

public class PersonalInformationWithScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		String idNumber = scanner.nextLine();
		String phoneNumber = scanner.nextLine();
		
		System.out.println("1. �̸�: "+ name);
		System.out.println("2. �ֹι�ȣ �� 6�ڸ�: "+ idNumber);
		System.out.println("3. ��ȭ��ȣ: "+ phoneNumber);
	}

}
