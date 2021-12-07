package problemInheritance.q05;

import problemInheritance.q03.Point;

public class PositivePoint extends Point {

    public PositivePoint() {
        super(0, 0);
    }

    public PositivePoint(int x, int y) {
        super(x, y);
    }

    @Override
    protected void move(int x, int y) {
        if (x < 0 || y < 0) {
        } else {
            super.move(x,y);
        }
    }
    public String toString() {
        return  "p의 좌표는 (" + getX()+","+getY()+")";
    }

    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");

        p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString() + "입니다.");

        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");
    }
}
