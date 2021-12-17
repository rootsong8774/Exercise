package problemCollectionFramework.q09;

import java.util.HashMap;
import java.util.Scanner;

record CustomerPoint(String name, Integer point){

    @Override
    public String toString() {
        return "("+name+", "+ point+")";
    }
}

public class PointManager {

    private final static Scanner scanner = new Scanner(System.in);
    private final static HashMap<String, CustomerPoint> customerList = new HashMap<>();

    static void run() {
        while (true) {
            System.out.print("이름과 포인트 입력 (q 입력 시 종료)>>");

            try {
                String name = scanner.next();

                if (name.equals("q")) {
                    break;
                }
                int point = scanner.nextInt();
                customerList.put(name, new CustomerPoint(name, point));
            } catch (Exception e) {
                System.out.println("유효하지 않은 입력입니다. 입력할 정보는"
                    + "이름 포인트입니다.\n 포인트 숫자로 입력해주세요");
                continue;
            }
            for(String key: customerList.keySet()){
                System.out.print(customerList.get(key));
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        System.out.println("포인트 관리 프로그램");
        System.out.println("-----------------------");
        PointManager.run();
    }
}
