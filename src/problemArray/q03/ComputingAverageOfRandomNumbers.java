package problemArray.q03;

import java.util.Random;

public class ComputingAverageOfRandomNumbers {

	public static void main(String[] args) {
		int[] randomNum = new int[10];
		Random r = new Random();
		
		int sum = 0;
		for(int i=0; i<randomNum.length; i++) {
			randomNum[i]=r.nextInt(100);
			sum += randomNum[i];
		}
		double avg = (double) sum/(randomNum.length);
		System.out.printf("총합은: %d\n", sum);
		System.out.printf("평균값은: %.2f", avg);
	}

}
