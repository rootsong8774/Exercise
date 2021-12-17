package problemCollectionFramework.q10;


import java.util.Vector;

interface IStack<T> {

    T pop();

    boolean push(T ob);
}

public class MyStack extends Vector implements IStack {

    Vector<Integer> integerVector;
    MyStack() {

    }

    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack();

        for (int i = 0; i < 10; i++) {
            stack.push(i); // 10개의 정수 푸시
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

        return this.integerVector.remove(this.integerVector.size());
    }

    @Override
    public boolean push(Object ob) {
        this.integerVector.add((Integer) ob);
        return false;
    }
}
