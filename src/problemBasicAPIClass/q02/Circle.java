package problemBasicAPIClass.q02;

import java.util.Objects;

public record Circle(int x, int y, int radius) {

    @Override
    public String toString() {
        return "Circle(" + x + ", " + y + ")" + "반지름" + radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) {
        Circle a = new Circle(2, 3, 5); // 중심 (2,3)에 반지름 5인 원
        Circle b = new Circle(2, 3, 30); // 중심 (2,3)에 반지름 30인 원
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if (a.equals(b)) {
            System.out.println("같은 원");
        } else {
            System.out.println("서로 다른 원");
        }
    }
}
