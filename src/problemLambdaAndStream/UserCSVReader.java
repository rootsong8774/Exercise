package problemLambdaAndStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class UserCSVReader {

    public static void main(String[] args) throws IOException {
        List<List<String>> csvList = new ArrayList<>();
        File csv = new File(
            Objects.requireNonNull(UserCSVReader.class.getResource("User.csv")).getPath());

        BufferedReader bufferedReader;
        String line;
        bufferedReader = new BufferedReader(new FileReader(csv));
        while ((line = bufferedReader.readLine()) != null) {
            List<String> lineList;
            String[] lineArray = line.split(", ");
            lineList = Arrays.asList(lineArray);
            csvList.add(lineList);

        }

        System.out.println("============================Q6.1============================");
        List<String> hobbyList = csvList.stream().skip(1).map(strings -> strings.get(1))
            .map(s -> s.split(":")).flatMap(Arrays::stream).distinct().toList();
        hobbyList.stream().map(hobby -> "(" + hobby + ":" + countHobby(csvList, hobby) + ")")
            .forEach(
                s -> System.out.print(s + " "));
        System.out.println("\n============================Q6.2============================");

        List<List<String>> jeongList = csvList.stream().filter(s -> s.get(0).startsWith("정"))
            .toList();

        hobbyList.stream().map(hobby -> "(" + hobby + ":" + countHobby(jeongList, hobby) + ")")
            .forEach(
                s -> System.out.print(s + " "));

        System.out.println("\n============================Q6.3============================");
        System.out.println("'좋아'라는 단어는 " + countIntroSearch(csvList, "좋아") + "번 사용되었습니다.");
    }


    public static int countHobby(List<List<String>> csvList, String hobby) {
        List<String> hobbyList = csvList.stream().skip(1).map(strings -> strings.get(1))
            .map(s -> s.split(":")).flatMap(Arrays::stream).toList();
        return (int) hobbyList.stream().filter(s -> s.equals(hobby)).count();

    }

    /*public static int countLastName(List<List<String>> csvList, String lastName) {
        List<Character> lastNameList = csvList.stream().skip(1)
            .map(strings -> strings.get(0).charAt(0)).toList();
        return (int) lastNameList.stream().filter(s -> s.equals(lastName.charAt(0))).count();

    }*/

    public static int countIntroSearch(List<List<String>> csvList, String word) {
        List<String> introList = csvList.stream().skip(1).map(strings -> strings.get(2)).toList();
        List<Integer> countList = introList.stream().map(s -> {
            int count = 0;
            for (int i = 0; i < s.length() - word.length() + 1; i++) {
                if (s.startsWith(word, i)) {
                    count++;
                }
            }
            return count;
        }).toList();

        return countList.stream().reduce(0, Integer::sum);
    }


}


