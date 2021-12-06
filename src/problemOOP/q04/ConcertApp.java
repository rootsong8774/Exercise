package problemOOP.q04;

import java.util.Scanner;

class Concert {
    private String hallName;
    private Group[] group = new Group[3];
    private Scanner scanner = new Scanner(System.in);
    public Concert(String hallName){
        this.hallName = hallName;
        group[0]=new Group('S',10);
        group[1]=new Group('A',10);
        group[2]=new Group('B',10);

    }
    private void reserve(){
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int type = scanner.nextInt();
        if(type <1|| type>3){
            System.out.println("잘못된 입력입니다.");
            return;
        }
        group[type-1].reserve();

    }
    private void show(){
        for(int i =0; i< group.length;i++){
            group[i].show();

        }
        System.out.println("<< 조회를 완료하였습니다.");
    }
    private void cancel(){
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int type = scanner.nextInt();
        if(type <1|| type>3){
            System.out.println("잘못된 입력입니다.");
            return;
        }
        group[type-1].cancel();
    }
    public void run() {
        while (true){
            System.out.println(hallName +"예약 시스템입니다.");
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int menu = scanner.nextInt();
            if (menu==4) break;
            switch (menu){
                case 1: reserve(); break;
                case 2: show(); break;
                case 3: cancel(); break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }


    }
}
class Group{
    private char type;
    private Seat[] seats;
    private Scanner scanner= new Scanner(System.in);
    public Group(char type, int num){
        this.type = type;
        seats = new Seat[num];
        for(int i=0; i<seats.length;i++){
            seats[i] = new Seat();
        }
    }
    public boolean reserve() {
        int no; String name;
        show();
        System.out.print("이름>>");
        name = scanner.next();
        System.out.print("좌석번호>>");
        no = scanner.nextInt();
        if(no<1|| no>= seats.length){
            System.out.println("이름 혹은 좌석번호에 관한 입력이 잘못되었습니다.");
            return  false;
        }
        if(seats[no-1].isOccupied()){
            System.out.println("이미 예약된 좌석입니다.");
            return false;
        }
        seats[no-1].reserve(name);
        return true;
        }
    public boolean cancel() {
        show();
        System.out.print("이름>>");
        String name = scanner.next();
        if(name!= null){
            for(int i =0; i<seats.length;i++){
                if(seats[i].match(name)){
                    seats[i].cancel();
                    return true;
                }
            }
            System.out.println("예약자 이름을 찾을 수 없습니다");
        }
        return false;}
    public void show(){
        System.out.print(type + ">>");
        for(int i =0; i<seats.length; i++){
            if(seats[i].isOccupied()){
                System.out.print(seats[i].getName());
            } else{
                System.out.print("---");
            }
            System.out.print(" ");

        }
        System.out.println(" ");

    }

}
class Seat{
    private String name;
    public Seat( ){name= null;}
    private Scanner scanner = new Scanner(System.in);
    public String getName() {
       return name;}
    public void cancel(){
        name = null;
    }
    public void reserve(String name) {this.name = name;}
    public boolean isOccupied() {
        if (name == null) {
            return false;
        } else {
            return true;
        }
    }
    public boolean match(String name) {

            return name.equals(this.name);
        }



}
public class ConcertApp {
    public static void main(String[] args) {
        Concert concert =new Concert("명품콘서트홀");
        concert.run();


    }
}

