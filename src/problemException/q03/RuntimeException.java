package problemException.q03;

public class RuntimeException {

    public static void main(String[] args) {
        int a, b, c;
        a = 5;
        b = 2;
        int[] ar = {1, 2, 3, 4, 5};
        c = a / b;
        System.out.println("c = " + c);
        try {
            ar[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행중 예외 발생");
        } finally {
            System.out.println("프로그램 실행 완료");
        }
    }
}
