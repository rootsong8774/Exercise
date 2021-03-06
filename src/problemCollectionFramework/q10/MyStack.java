package problemCollectionFramework.q10;

import java.util.Vector;

interface IStack<T> {

    T pop();

    boolean push(T ob);
}

public class MyStack extends Vector implements IStack {

    private Vector<Integer> integerVector = new Vector<>();

    MyStack() {

    }

    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack();

        for (int i = 0; i < 10; i++) {
            int inputNum = 2 * i + 1;
            stack.push(inputNum); // 10개의 정수 푸시
        }
        while (true) { // 스택이 빌 때까지 pop
            Integer n = stack.pop();
            if (n == null) {
                break; // 스택이 빈 경우
            }
            System.out.print(n + " ");
        }

    }

    @Override
    public Object pop() {
        if (integerVector.isEmpty()) {
            return null;
        } else {

            return this.integerVector.remove(this.integerVector.size() - 1);
        }

    }

    @Override
    public boolean push(Object ob) {
        this.integerVector.add((Integer) ob);
        return false;
    }
}
