package chap03sec02.q11;

import java.util.Scanner;

public class LoginWithScanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���̵�: ");
		String name = scanner.nextLine();
		
		System.out.print("�н�����: ");
		String strpassword = scanner.nextLine();
		int password = Integer.parseInt(strpassword);
		
		if(name.equals("java")) {
			if(password==12345) {
				System.out.println("�α��� ����");
							
			}
			else {
				System.out.println("�α��� ����:�н����� Ʋ��");
			}
		}
		else {
			System.out.println("�α��� ����:���̵� �������� ����");
		}
		
	}

}
