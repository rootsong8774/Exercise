package problemInheritance.q03;

public class ColorPoint extends Point {

    String color;

    public ColorPoint() {
        super(0, 0);
        color = "BLACK";
    }

    public ColorPoint(int x, int y) {
        super(x, y);
    }

    public void setXY(int x, int y) {
        super.getX();
        super.getY();
        return;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return color + "색에 (" + getX() + "," + getY() + ") 위치의 점";
    }

    public static void main(String[] args) {
        ColorPoint zeroPoint = new ColorPoint(); // BLACK 색에 (0,0) 위치의 점
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint cp = new ColorPoint(10, 10);
        cp.setXY(5, 5);
        cp.setColor("RED");
        System.out.println(cp.toString() + "입니다.");
    }
}
