package problemThread.q04;

public class Echoer extends Thread{
    private final String msg;
    private final Echo echo;


    public Echoer(String msg, Echo echo) {
        this.msg = msg;
        this.echo = echo;
    }

    @Override
    public void run() {
        echo.echoMethod(msg);



    }
}
