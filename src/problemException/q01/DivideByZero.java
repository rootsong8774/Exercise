package problemException.q01;

public class DivideByZero {

    public static void main(String[] args) {
        int a, b, c;
        try {
            a = 2;
            b = 0;
            c = a / b;
            System.out.println("c = " + c);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생.");
        } finally {
            System.out.println("프로그램 실행 완료");
        }

    }
}
