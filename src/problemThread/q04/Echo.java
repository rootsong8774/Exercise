package problemThread.q04;


public class Echo {

    /*public void echoMethod(String msg)*/
    public synchronized void echoMethod(String msg) {

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(msg);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
