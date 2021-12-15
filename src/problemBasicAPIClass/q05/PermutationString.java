package problemBasicAPIClass.q05;

import java.util.Scanner;

public class PermutationString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("회전시킬 문자열을 입력하세요.");
        String str = scanner.nextLine();
        for(int i = 0; i<=str.length();i++){
            String pString = str.substring(i)+str.substring(0,i);
            System.out.println(pString);
        }

    }
}
