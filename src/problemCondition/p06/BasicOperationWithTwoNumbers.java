package problemCondition.p06;

import java.util.Scanner;

public class BasicOperationWithTwoNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");
		int op1 = scanner.nextInt();
		String op = scanner.next();		
		int op2 = scanner.nextInt();
		double res = 0;
		  
		if(op.equals("/")) {
			res = (double)op1 / op2;
		} else if(op.equals("+")) {
			res =  op1 + op2;
		} else if(op.equals("-")) {
			res =  op1 - op2;
		} else if(op.equals("*")) {
			res = op1 * op2;
		} 
		
		
		System.out.print(op1 + op + op2 + "의 계산 결과는 " + res);
		scanner.close();

	}

}
