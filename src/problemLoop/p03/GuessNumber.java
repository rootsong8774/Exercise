package problemLoop.p03;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int low, high;
		int card; // ī�忡 ���� ��ȣ ��(����� ��, ����)
		Random r = new Random(); // ���� �߻��� ����
		card = r.nextInt(100);
		System.out.println();
		Scanner scanner = new Scanner(System.in); // Ű���� �Է±� ����
		int chance = 10;
		
		while(true) {
			System.out.println("�־��� ��ȸ�� "+chance+" �� ���ҽ��ϴ�.");
			System.out.println("0~99���� ���� �����Ͽ����ϴ�. ���߾� ������");
			String s = scanner.nextLine();
			int trial = Integer.parseInt(s);
			if (trial > card) {
				System.out.println(trial + "���� ���� ���Դϴ�. �ٽ� �õ��ϼ���");
			} else if (trial < card){
				System.out.println(trial +"���� ���� ���Դϴ�. �ٽ� �õ��ϼ���");
			} else if (trial == card) {
				System.out.println("�����Դϴ�. ���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("������ ������ϴ�.");
			}
			chance--;
			if (chance==0) {
				System.out.println("�� �̻� ��ȸ�� �����ϴ�. ���α׷��� �����մϴ�.");
				break;
			}
			
		}
	}

}
