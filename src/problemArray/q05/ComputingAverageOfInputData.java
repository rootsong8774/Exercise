package problemArray.q05;

import java.util.Scanner;

public class ComputingAverageOfInputData {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하세요>> ");
		
		int sum = 0;
		for(int i =0; i<intArray.length; i++) {
			int inputNum= scanner.nextInt();
			intArray[i]=inputNum;
			sum += intArray[i];
		}
		
		double avg = (double) sum/(intArray.length);
		System.out.printf("총합은: %d\n", sum);
		System.out.printf("평균값은: %.2f", avg);

	}

}
