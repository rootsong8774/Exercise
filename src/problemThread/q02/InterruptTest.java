package problemThread.q02;

import java.util.Scanner;

public class InterruptTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Thread workingThread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                    System.out.println("작업 실행 중");
                } catch (InterruptedException e) {
                    System.out.println("작업 완료");
                    break;
                }
            }
        });

        workingThread.start();

        int scanInput;
        while (true) {
            try {
                scanInput = scanner.nextInt();
                if (scanInput == 1) {
                    workingThread.interrupt();
                    break;
                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }

    }

}
