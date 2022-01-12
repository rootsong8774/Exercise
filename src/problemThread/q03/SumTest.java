package problemThread.q03;

public class SumTest {

    public static void main(String[] args) {

        Accumulator workingThread1 = new Accumulator(3);
        Accumulator workingThread2 = new Accumulator(2);

        workingThread1.start();
        workingThread2.start();

        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("누적 값\t: "+(workingThread1.getSum()+workingThread2.getSum()));


    }

}
