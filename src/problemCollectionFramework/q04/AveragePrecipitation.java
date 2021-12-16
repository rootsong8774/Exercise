package problemCollectionFramework.q04;

import java.util.Scanner;
import java.util.Vector;

public class AveragePrecipitation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Vector<Integer> precipitation = new Vector<>();
        while (true) {
            System.out.print("강수량 입력 (-1 입력시 종료)>>");

            try {
                int inputPrecipitation = scanner.nextInt();
                if (inputPrecipitation == -1) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                precipitation.add(inputPrecipitation);
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다.");
                scanner = new Scanner(System.in);
                continue;
            }
            int sum = 0;
            for (Integer ele : precipitation) {
                System.out.print(ele + " ");
                sum += ele;
            }
            System.out.println();
            System.out.println("현재 평균 " + sum / precipitation.size());

        }
    }

}
