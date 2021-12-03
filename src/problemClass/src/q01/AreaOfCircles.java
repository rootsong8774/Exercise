package q01;
class Circle {

    int radius;
    String name;
    final static double Pi = 3.14;

    public double getArea() {

        return Pi * radius * radius;
    }
}
public class AreaOfCircles {
    public static void main(String[] args) {
        Circle pizza = new Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);

    }
}
