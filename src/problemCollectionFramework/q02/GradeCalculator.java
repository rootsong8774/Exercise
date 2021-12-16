package problemCollectionFramework.q02;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GradeCalculator {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Character> list = new ArrayList<>();
        Map<Character, Double> gradeMap = new Hashtable<>();
        gradeMap.put('A', 4.0);
        gradeMap.put('B', 3.0);
        gradeMap.put('C', 2.0);
        gradeMap.put('D', 1.0);
        gradeMap.put('F', 0.0);
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        int i = 0;
        while (i < 6) {
            Character grade = scanner.next().charAt(0);
            if (gradeMap.containsKey(grade)) {
                list.add(grade);
                i++;
            } else {
                continue;
            }
        }
        double sum = 0;
        for (Character ele : list) {
            sum += gradeMap.get(ele);
        }
        System.out.println("학점의 총 환산 점수: " + sum);
        System.out.println("평균 학점: " + sum / list.size());
    }
}
