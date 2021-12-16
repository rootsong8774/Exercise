package problemCollectionFramework.q03;

import java.util.HashMap;
import java.util.Scanner;

public class CountryAndPopulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> nations = new HashMap<>();
        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");

        while (true) {
            System.out.print("나라 이름, 인구 >> ");

            String nation = scanner.next();
            if (nation.equals("그만")) {
                break;
            }
            Integer population = scanner.nextInt();
            nations.put(nation, population);
        }

        while (true) {
            System.out.print("인구 검색 >>");

            String searchNation = scanner.next();
            if (searchNation.equals("그만")) {
                break;
            } else if (nations.containsKey(searchNation)) {
                System.out.println(searchNation + "의 인구는 " + nations.get(searchNation));
            } else {
                System.out.println("해당 국가에 대한 인구 정보가 존재하지 않습니다.");
            }
        }


    }

}

