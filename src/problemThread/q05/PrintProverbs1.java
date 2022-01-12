package problemThread.q05;

public class PrintProverbs1 {

    public static void main(String[] args) {

        String proverbs = "Time is money";

        printCuttedWord pcw = new printCuttedWord(proverbs);
        SyncPrintWords thread1 = new SyncPrintWords(proverbs,pcw);
        SyncPrintWords thread2 = new SyncPrintWords(proverbs,pcw);

        thread1.setName("속담1");
        thread2.setName("속담2");

        thread1.start();
        thread2.start();


    }

}
