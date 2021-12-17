package problemCollectionFramework.q06;

import java.util.HashMap;
import java.util.Scanner;

record Student(String name, String major, int stuNo, Double grade) {

    @Override
    public String toString() {
        return "이름: " + name + ", 전공: " + major + ", 학번: " + stuNo + ", 학점: " + grade;
    }
}

public class StudentHashMap {

    final static private Scanner scanner = new Scanner(System.in);
    final static private HashMap<String, Student> studentMap = new HashMap<>();

    static void input() {
        while (true) {
            System.out.print("이름, 학과, 학번, 평점을 입력하세요. (그만 입력 시 종료)>>");
            try {
                String data = scanner.nextLine();
                if (data.equals("그만")) {
                    break;
                }
                String name = data.split(", ")[0];
                String major = data.split(", ")[1];
                int stuNo = Integer.parseInt(data.split(", ")[2]);
                double grade = Double.parseDouble(data.split(", ")[3]);
                if (grade < 0.0 || grade > 4.5) {
                    System.out.println("학점 입력 가능 범위를 벗어났습니다. (0.0-4.5)");
                    continue;
                }
                studentMap.put(name, new Student(name, major, stuNo, grade));
            } catch (Exception e) {
                System.out.println("유효하지 않은 입력입니다. ,로 구분하여 입력하세요. \n입력할 정보는"
                    + "이름, 전공, 학번, 학점입니다. 학번과 학점은 숫자로 입력해주세요");
                continue;
            }

        }
    }

    static void search() {
        while (true) {
            System.out.print("학생이름>>");
            String nameInput = scanner.next();
            if (nameInput.equals("그만")) {
                System.out.println("프로그램 종료");
                break;
            }
            if (studentMap.containsKey(nameInput)) {
                System.out.println(studentMap.get(nameInput));
            } else {
                System.out.println("해당 학생이 목록에 존재하지 않습니다.");
            }


        }
    }

    public static void main(String[] args) {


        StudentHashMap.input();
        System.out.println("출력");
        StudentHashMap.search();

    }

}

