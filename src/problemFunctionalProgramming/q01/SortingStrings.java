package problemFunctionalProgramming.q01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class SortingStrings {

    public static void main(String[] args) {
        String[] sa = { "K", "o", "r", "e", "a", "n" };
        for(String str : sa){
            System.out.print(str+ " ");
        }
        System.out.println("\n==============");
        Arrays.sort(sa);
        for(String str : sa){
            System.out.print(str+ " ");
        }
       /* System.out.println("\n==============");
        Arrays.sort(sa,(s1, s2)-> s1.toUpperCase().charAt(0)-s2.toUpperCase().charAt(0));
        for(String str : sa){
            System.out.print(str+ " ");
        }*/

        System.out.println("\n==============");
        Arrays.sort(sa, Comparator.comparingInt(s -> s.toUpperCase().charAt(0)));
        for(String str : sa){
            System.out.print(str+ " ");
        }

        System.out.println("\n==============");
        /*Arrays.sort(sa,(s1,s2)-> s1.compareToIgnoreCase(s2));
        for(String str : sa){
            System.out.print(str+ " ");
        }*/
        Arrays.sort(sa, String::compareToIgnoreCase);
        for(String str : sa){
            System.out.print(str+ " ");
        }
    }
}
