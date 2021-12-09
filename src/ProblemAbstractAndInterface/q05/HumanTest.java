package ProblemAbstractAndInterface.q05;

interface Human {

    void eat();

    default void print() {
        System.out.println("인간입니다.");
    }

    static void echo() {
        System.out.println("야호!!!");
    }
}

class Worker implements Human {

    @Override
    public void print() {
        System.out.println("노동자입니다.");
    }

    public void eat() {
        System.out.println("식사 중입니다.");
    }
}

class Student implements Human {

    int age;

    Student(int age) {
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("학생입니다.");
    }

    public void eat() {
        System.out.println("식사 중입니다.");
    }
}

public class HumanTest {

    public static void main(String[] args) {
        Human.echo();
        //Human.print(); print() is not available because it does not make any instance.

        Student s = new Student(20);
        s.print();
        s.eat();

        Worker p = new Worker();
        p.print();
        p.eat();
    }

}
