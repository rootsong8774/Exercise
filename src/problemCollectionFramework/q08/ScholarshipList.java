package problemCollectionFramework.q08;

import java.util.HashMap;
import java.util.Scanner;


public class ScholarshipList {

    private final static Scanner scanner = new Scanner(System.in);
    private final static HashMap<String, Double> studentList = new HashMap<>();

    static void input() {
        while (true) {
            System.out.print("이름과 학점 (q 입력 시 종료)>>");

            try {
                String name = scanner.next();

                if (name.equals("q")) {
                    break;
                }
                double grade = scanner.nextDouble();
                if (grade < 0.0 || grade > 4.5) {
                    System.out.println("학점 입력 가능 범위를 벗어났습니다. (0.0-4.5)");
                    continue;
                }
                studentList.put(name, grade);
            } catch (Exception e) {
                System.out.println("유효하지 않은 입력입니다. \n입력할 정보는"
                    + "이름 학점입니다. 학점은 숫자로 입력해주세요");
                continue;
            }
        }
    }

    static void search() {
        while (true) {
            System.out.print("장학생 선발 학점 기준 (-1 입력시 종료)>>");
            double criteria;
            try {
                criteria = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("유효하지 않은 입력입니다. 소수점을 포함하는 숫자로 입력해주세요");
                continue;
            }
            if (criteria == -1) {
                break;
            }
            if (criteria < 0 || criteria > 4.5) {
                System.out.println("입력 범위를 벗어났습니다. (0.0-4.5)");
                continue;
            }
            System.out.print("장학생 명단: ");
            for (String key : studentList.keySet()) {
                if (studentList.get(key) >= criteria) {
                    System.out.print(key + " ");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        System.out.println("미래의 장학생 관리 시스템");
        ScholarshipList.input();
        ScholarshipList.search();

    }
}
