package problemThread.q06;

import java.util.Arrays;
import java.util.List;
class printCuttedWord {
    String proverbs;
    List<String> cuttedWord;

    public printCuttedWord(String proverbs)  {

        this.proverbs = proverbs;
        this.cuttedWord = Arrays.asList(proverbs.split(" "));
    }



    public void pcwMethod(){
        for (String s : this.cuttedWord) {
            try {
                Thread.sleep(300);
                System.out.println(UnsyncPrintWords.currentThread().getName() + ": " + s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class UnsyncPrintWords extends Thread {
    String proverbs;
    printCuttedWord pcw;

    public UnsyncPrintWords(String proverbs,printCuttedWord pcw) {
        this.pcw = pcw;
        this.proverbs=proverbs;
    }

    @Override
    public void run() {
        pcw.pcwMethod();
    }
}
