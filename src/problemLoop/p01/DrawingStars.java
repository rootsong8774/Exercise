package problemLoop.p01;

import java.util.Scanner;

public class DrawingStars {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
		String inputData = scanner.nextLine();
		int num = Integer.parseInt(inputData);
		int i =0;
		while(i<num) {
			System.out.print("*");
			i++;
		}
		
		
	}

}
