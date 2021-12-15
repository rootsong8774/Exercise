package problemBasicAPIClass.q03;

import java.util.Calendar;

public class DailyGreetings {

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        int hourOfDay = now.get(Calendar.HOUR_OF_DAY);
        int hour = now.get(Calendar.HOUR);
        int minute = now.get(Calendar.MINUTE);
        System.out.println("현재 시간은 "+hour + "시 "+minute+"분입니다.");
        if(hourOfDay>=4 &&hourOfDay<12){
            System.out.println("Good Morning");
        } else if(hourOfDay>=12 && hourOfDay < 18) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Night");
        }
    }
}
