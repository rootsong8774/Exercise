package problemArray.q04;

import java.util.Random;

public class DisplayTwoDimensionalArray {

	public static void main(String[] args) {
		int intArray[][]=new int[4][4];
		Random r = new Random();
		
		for(int i = 0; i< intArray.length;i++) {
			for(int j = 0; j< intArray[i].length;j++) {
				intArray[i][j]=r.nextInt(100);
				System.out.print(intArray[i][j]+" ");
			}
			System.out.println();
		}

	}

}
