package problemOOP.q02;

import java.lang.reflect.Array;

class ArrayUtil {
    public static int [] concat(int[] a, int[] b) { // 배열 a와 b를 연결한 새로운 배열 리턴
        int n = a.length + b.length;
        int[] tmp = new int[n];
        System.arraycopy(a,0, tmp, 0, a.length);
        System.arraycopy(b, 0, tmp, a.length, b.length);

        return tmp;

    }
    public static void print(int[] a) { // 배열 a 출력

        for(int item : a) {
            System.out.print(item + " ");
        }

    }
}
public class StaticEx {
    public static void main(String[] args) {
        int [] array1 = { 1, 5, 7, 9 };
        int [] array2 = { 3, 6, -1, 100, 77 };
        int [] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
