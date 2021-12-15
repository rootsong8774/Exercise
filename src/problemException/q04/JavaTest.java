package problemException.q04;

class NetAccess implements AutoCloseable {

    public void open() {
        System.out.println("접속");
    }

    public void send() {
        System.out.println("전송");
    }

    @Override
    public void close(){
        System.out.println("해제");
    }
}

public class JavaTest {

    public static void main(String[] args) {

        NetAccess netAccess = new NetAccess();

        try {
            netAccess.open();
            netAccess.send();

        } finally {
            try {
                netAccess.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }


}
