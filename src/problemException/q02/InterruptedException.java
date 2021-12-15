package problemException.q02;

public class InterruptedException {

    public static void main(String[] args) {
        System.out.println("프로그램 시작");

        try {
            Thread.sleep(3000);

        } catch (java.lang.InterruptedException e) {

        }
        System.out.println("프로그램 끝");

    }

}
