package problemIOStream;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class HangManGame {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Reader reader = new FileReader(
            Objects.requireNonNull(HangManGame.class.getResource("words.txt")).getPath());
        BufferedReader br = new BufferedReader(reader);
        int count = 0;
        int listNum;
        int chance;
        List<String> wordList = new LinkedList<>();
        while (true) {
            String data = br.readLine();
            if (data == null) {
                break;
            }
            wordList.add(data);
            count++;
        }
        while (true) {
            listNum = (int) (count * (Math.random()));

            String targetWord = wordList.get(listNum);
            String maskedWord = "_".repeat(targetWord.length());
            StringBuilder maskedBuilder = new StringBuilder(maskedWord);
            chance = targetWord.length() + 3;

            System.out.println("추측할 단어입니다 : " + maskedWord);
            for (int i = 0; i < chance; i++) {

                System.out.println("지금까지 추측한 내용입니다 : " + maskedBuilder);
                System.out.print("추측한 문자를 입력하세요 : ");
                char guess = scanner.nextLine().charAt(0);
                List<Integer> indexList;

                if (targetWord.contains(String.valueOf(guess))) {
                    indexList = findIndexes(targetWord, guess);
                    for (Integer integer : indexList) {
                        maskedBuilder.setCharAt(integer, guess);
                    }

                } else {
                    System.out.println("해당 문자는 존재하지 않습니다.");
                }

                if (i == chance - 1 && !maskedBuilder.toString().equals(targetWord)) {
                    System.out.println("게임을 완료하지 못했습니다.");
                    break;
                }

                if (maskedBuilder.toString().equals(targetWord)) {
                    System.out.println("정답입니다.");
                    break;
                }

                System.out.println(chance - (i + 1) + "번 더 추측할 수 있습니다.");
                System.out.println("계속 진행합니다.");
                System.out.println();


            }

            System.out.print("한 번 더 하시겠습니까? (Y/N) >>");
            try {
                String newGame = scanner.nextLine();
                if (newGame.equals("Y")) {
                    System.out.println("게임을 다시 시작합니다.");
                } else if (newGame.equals("N")) {
                    System.out.println("유저의 요청에 따라 프로그램을 종료합니다.");
                    break;
                } else {
                    throw new Exception();

                }
            } catch (Exception e) {
                System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
                break;
            }
        }


    }

    public static List<Integer> findIndexes(String word, char letter) {
        List<Integer> indexList = new ArrayList<>();
        int index = word.indexOf(letter);

        while (index != -1) {
            indexList.add(index);
            index = word.indexOf(word, index + 1);
        }
        return indexList;
    }


}
