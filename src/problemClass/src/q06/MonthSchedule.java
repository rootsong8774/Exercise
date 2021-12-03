package q06;

import java.util.Scanner;

class Day {
    private String work; // 하루의 할 일을 나타내는 문자열
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}
public class MonthSchedule {
    int nDays;
    Day [] days; // Day 객체 배열
    Scanner scanner;

    public MonthSchedule(int nDays){
        this.nDays = nDays;
        days = new Day[nDays];
        for(int i=0; i<days.length;i++)
            days[i] = new Day();
        scanner = new Scanner(System.in);
    }
    private void input(){
        System.out.print("날짜(1~"+nDays+")");
        int day = scanner.nextInt();
        System.out.print("할 일(빈칸없이 입력)?        ");
        String work = scanner.next();
        if(day < 0|| day> days.length){
            System.out.println("날짜 입력이 잘못되었습니다.");
            return;
        }
        days[day-1].set(work);
    }
    private void view(){
        System.out.print("날짜(1~"+nDays+")");
        int day = scanner.nextInt();
        if(day < 0|| day> days.length){
            System.out.println("날짜 입력이 잘못되었습니다.");
            return;
        }
        String work = days[day-1].get();
        days[day-1].set(work);
        System.out.print(day + "일에 할 일은 " );
        days[day-1].show();

    }
    private void finish(){
        scanner.close();
        System.out.println("프로그램을 종료합니다.");
    }

    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");

        while(true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1 -> input();
                case 2 -> view();
                case 3 -> {
                    finish();
                    return;
                }
                default -> System.out.println("잘못입력하였습니다.");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MonthSchedule december = new MonthSchedule(31); // 4월달의 할 일
        december.run();
    }

}
