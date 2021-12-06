package problemOOP.q01;

import java.util.Scanner;

class Phone {
    String name;
    String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }
}

public class PhoneBook {
    Scanner scanner;
    Phone [] pArray;
    public PhoneBook() {
        scanner = new Scanner(System.in);

    }

    void read() {
        System.out.println("인원수>>");
        int n = scanner.nextInt();
        pArray = new Phone[n];
        System.out.println("인원수 입력완료!");
        for(int i = 0; i< pArray.length; i++){
            System.out.println("이름 전화번호>>");
            String name = scanner.next();
            String tel = scanner.next();
            pArray[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다.");
    }//전체 내용 출력
    /*void print(){
        for(Phone item : pArray){
            System.out.println(item.name+ " "+ item.tel);

        }
    }*/
    String search(String name) {
        for(int i = 0; i<pArray.length; i++){

            if(pArray[i].name.equals(name))  return pArray[i].tel;
        }

        return "해당 이름이 존재하지 않습니다.";


    }

    void run(){
        read();
        while(true){
            System.out.println("검색하고자 하는 이름을 입력하세요.");
            String name = scanner.next();
            if(name.equals("q")) break;
            System.out.println(search(name));
        }
        scanner.close();

        //        print();
    }


    public static void main(String[] args) {
        new PhoneBook().run();
    }
}
