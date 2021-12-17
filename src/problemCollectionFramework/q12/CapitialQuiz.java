package problemCollectionFramework.q12;

import java.util.HashMap;
import java.util.Scanner;


public class CapitialQuiz {

    private static Scanner scanner = new Scanner(System.in);
    private final static HashMap<String, String> quizMap = new HashMap<>();


    static void input() {
        int quizCount = 1;
        while (true) {
            System.out.print("나라와 수도 입력" + quizCount + ">>");
            String country = scanner.next();
            if (country.equals("그만")) {
                break;
            }
            String capital = scanner.next();
            if (quizMap.containsKey(country)) {
                System.out.println("해당 국가는 이미 있습니다.");
                continue;
            }
            quizMap.put(country, capital);
            quizCount++;
        }
    }

    static void quizPrint() {
        while (true) {
            if (quizMap.size() == 0) {
                System.out.println("더 이상 문제가 없습니다.");
                System.out.println("퀴즈를 새로 입력해주세요.");
                break;
            }
            int quizNum = (int) (Math.random() * (quizMap.size()) + 1);

            String key = (String) quizMap.keySet().toArray()[quizNum-1];
            System.out.println(key + "의 수도는? ");
            String answer = scanner.next();
            if (answer.equals("그만")) {
                break;
            }
            if (quizMap.get(key).equals(answer)) {
                System.out.println("정답!!!");
            } else {
                System.out.println("아닙니다.");
            }
            quizMap.remove(key);
        }
    }

    static void quit() {
        System.out.println("게임을 종료합니다.");
        System.exit(0);
    }

    static void run() {
        int menuNum;
        while (true) {
            System.out.print("입력:1, 퀴즈:2, 종료:3>>");
            try {
                menuNum = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                scanner = new Scanner(System.in);
                continue;
            }
            switch (menuNum) {
                case 1:
                    input();
                    break;
                case 2:
                    quizPrint();
                    break;
                case 3:
                    quit();
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }
    }

    public static void main(String[] args) {
        CapitialQuiz.run();
    }
}
