package problemCollectionFramework.q01;


import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class PrintLargestValue {


    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자들을 입력하세요 (-1 입력시 종료)>>");
        int num;

        while (true) {
            try {
                num = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                scanner = new Scanner(System.in);
                continue;
            }
            if (num == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            vector.add(num);
        }
        Integer largerValue = vector.get(0);
        for (Integer integer : vector) {
            largerValue = Math.max(integer, largerValue);
        }
        System.out.println("가장 큰 수는 " + largerValue);


    }

}
