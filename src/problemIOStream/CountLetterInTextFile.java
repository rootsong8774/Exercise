package problemIOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Objects;
import java.util.Scanner;

public class CountLetterInTextFile {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("파일 이름을 입력하세요 : >>");
        String fileName = scanner.nextLine();
        System.out.print("세고자 하는 문자를 입력하세요 : >>");
        char letter = scanner.nextLine().charAt(0);
        Reader reader = new FileReader(
            Objects.requireNonNull(CountLetterInTextFile.class.getResource(fileName)).getPath());
        BufferedReader br = new BufferedReader(reader);
        while (true) {
            String data = br.readLine();
            if (data == null) {
                break;
            }
            count += countLetter(data, letter);


        }
        System.out.println(fileName + " 파일에 " + letter + " 문자가 " + count + "개");


    }

    public static long countLetter(String str, char ch) {
        return str.chars().filter(c -> c == ch).count();
    }

}
