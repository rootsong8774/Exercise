package problemThread.q05;

import java.util.Arrays;
import java.util.List;
class printCuttedWord {
    String proverbs;
    List<String> cuttedWord;

    public printCuttedWord(String proverbs)  {

        this.proverbs = proverbs;
        this.cuttedWord = Arrays.asList(proverbs.split(" "));
    }



    public synchronized void pcwMethod(){
        for (String s : this.cuttedWord) {
            try {
                Thread.sleep(300);
                System.out.println(SyncPrintWords.currentThread().getName() + ": " + s);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class SyncPrintWords extends Thread {
    String proverbs;
    printCuttedWord pcw;

    public SyncPrintWords(String proverbs,printCuttedWord pcw) {
        this.pcw = pcw;
        this.proverbs=proverbs;
    }

    @Override
    public void run() {
        pcw.pcwMethod();
    }
}
