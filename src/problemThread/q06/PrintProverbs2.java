package problemThread.q06;



public class PrintProverbs2 {

    public static void main(String[] args) {

        String proverbs = "Time is money";

        printCuttedWord pcw = new printCuttedWord(proverbs);
        UnsyncPrintWords thread1 = new UnsyncPrintWords(proverbs,pcw);
        UnsyncPrintWords thread2 = new UnsyncPrintWords(proverbs,pcw);

        thread1.setName("속담1");
        thread2.setName("속담2");

        thread1.start();
        thread2.start();


    }

}
