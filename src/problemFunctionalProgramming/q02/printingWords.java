package problemFunctionalProgramming.q02;

import java.util.List;

interface Wordable {
    void word();
}

public class printingWords {

    public static void main(String[] args) {
       Wordable[] wordables = {()-> System.out.println("가위"), ()-> System.out.println("나비"),
            ()-> System.out.println("다리"), ()-> System.out.println("마차")};
        for(Wordable w : wordables) {
            w.word();
        }
   }
}


