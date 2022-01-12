package problemThread.q03;

public class Accumulator extends Thread {

    private final int repeat;
    private int sum=0;

    public Accumulator(int repeat) {
        this.repeat = repeat;
    }

    public synchronized int getSum() {
        return sum;
    }

    @Override
    public synchronized void run() {
        for(int i =0; i<repeat;i++){
            int randomNum = (int) ((Math.random()) * 10);
            System.out.println(getName()+" : "+ randomNum);
            sum+= randomNum;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }


}
