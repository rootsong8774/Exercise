package problemInheritance02.q01;

import java.util.Scanner;

public class StackApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택 저장 공간의 크기를 입력>>");
        Integer stackCapcity = scanner.nextInt();
        StringStack stringStack = new StringStack(stackCapcity);
        while (true) {
            System.out.print("문자열 입력>>");
            String str = scanner.next();
            if (str.equals("그만")) {
                break;
            }
            if (!stringStack.push(str)) {
                System.out.println("스택이 가득차서 push할 수 없습니다.");
                break;
            }
        }
        scanner.close();
        System.out.print("스택에 저장된 모든 문자열 팝: ");
        int stackLength = stringStack.length();
        for (int i = 0; i < stackLength; i++) {
            System.out.print(stringStack.pop() + " ");
        }


    }
}
