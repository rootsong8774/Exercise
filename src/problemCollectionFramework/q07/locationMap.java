package problemCollectionFramework.q07;

import java.util.HashMap;
import java.util.Scanner;


record Location(String city, int longitude, int latitude) {

    @Override
    public String toString() {
        return "도시: " + city + ", 경도: " + longitude + ", 위도: " + latitude;
    }

}

public class locationMap {
    private final static Scanner scanner = new Scanner(System.in);
    private final static HashMap<String, Location> locationHashMap = new HashMap<>();

    static void input() {
        while (true) {
            System.out.print("도시이름, 경도, 위도를 입력하세요 (그만 입력 시 종료)>>");
            try {
                String cityInfo = scanner.nextLine();
                if (cityInfo.equals("그만")) {
                    break;
                }
                String city = cityInfo.split(", ")[0];
                int longitude = Integer.parseInt(cityInfo.split(", ")[1]);
                int latitude = Integer.parseInt(cityInfo.split(", ")[2]);
                locationHashMap.put(city, new Location(city, longitude, latitude));
            } catch (Exception e) {
                System.out.println("유효하지 않은 입력입니다. ,로 구분하여 입력하세요. 입력할 정보는"
                    + "도시, 경도, 위도입니다. 경도와 위도는 숫자로 입력해주세요");
                continue;
            }

        }
    }

    static void search(){
        while (true) {
            System.out.print("도시이름>>");
            String cityInput = scanner.next();
            if (cityInput.equals("그만")) {
                System.out.println("프로그램 종료");
                break;
            }
            if (locationHashMap.containsKey(cityInput)) {
                System.out.println(locationHashMap.get(cityInput));
            } else {
                System.out.println("해당 도시는 목록에 존재하지 않습니다.");
                continue;
            }


        }
    }
    public static void main(String[] args) {

        locationMap.input();
        locationMap.search();


    }
}
