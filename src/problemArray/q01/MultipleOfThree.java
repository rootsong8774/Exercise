package problemArray.q01;

import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		Scanner scanner = new Scanner(System.in);
		System.out.print("양의 정수 10개를 입력하세요>> ");
		for(int i =0; i<intArray.length; i++) {
			int inputNum= scanner.nextInt();
			intArray[i]=inputNum;
		}
		for(int i=0; i<intArray.length; i++) {
			if (intArray[i]%3==0) System.out.print(intArray[i]+" ");;
			
		}
		

	}

}
