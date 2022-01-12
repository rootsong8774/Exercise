package problemThread.q01;

public class OneSecondTimer {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            int i = 0;

            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(1000);
                        i++;
                        System.out.println(i + "초");
                    } catch (InterruptedException e) {
                        System.out.println("타이머 종료");
                    }
                }
            }
        });
        thread.setDaemon(true);
        thread.start();

        try {

            Thread.sleep(10000);
        } catch (InterruptedException e) {

        }
        thread.interrupt();

    }
}
