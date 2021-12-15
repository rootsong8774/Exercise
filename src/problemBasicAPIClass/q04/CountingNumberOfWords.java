package problemBasicAPIClass.q04;

import java.util.Scanner;

public class CountingNumberOfWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print(">>");
            String sentence = scanner.nextLine();
            if(sentence.equals("그만")){
                System.out.println("종료합니다...");
                System.exit(0);
            }
            System.out.println("어절 개수는 "+sentence.split(" ").length);
        }


    }
}
