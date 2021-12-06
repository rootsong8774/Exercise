package problemOOP.q03;

import java.util.Scanner;

class Dictionary {

    private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
    private static String[] eng = {"love", "baby", "money", "future", "hope"};

    public static String kor2eng(String word) {
        for (int i = 0; i < kor.length; i++) {
            if (kor[i].equals(word)) {
                return eng[i];
            }
        }
        return null;
    }

    public static String eng2kor(String word) {
        for (int i = 0; i < eng.length; i++) {
            if (eng[i].equals(word)) {
                return kor[i];
            }
        }
        return null;
    }
}


public class DicApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("한영 단어 검색 프로그램입니다. 단어를 입력하세요>>");
            String word = scanner.next();
            if (word.equals("q")) {
                break;
            }
            String engword = Dictionary.kor2eng(word);
            if (engword == null) {
            } else {
                System.out.println(word + ": " + engword);
            }
            String korword = Dictionary.eng2kor(word);
            if (korword == null) {
                System.out.println("해당 단어가 사전에 존재하지 않습니다");
            } else {
                System.out.println(word + ": " + korword);
            }

        }
        scanner.close();
    }
}
