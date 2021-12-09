package problemInheritance02.q04;

import java.util.Scanner;

public class Bear extends GameObject {

    private final Scanner scanner = new Scanner(System.in);

    public Bear(Integer startX, Integer startY, Integer distance) {
        super(startX, startY, distance);
    }

    @Override
    protected void move() {

        System.out.print("왼쪽(a), 아래(s), 위(w), 오른쪽(d) >>");
        char moveButton = scanner.next().charAt(0);
        switch (moveButton) {
            case 'w' -> y -= distance;
            case 's' -> y += distance;
            case 'a' -> x -= distance;
            case 'd' -> x += distance;
            default -> {
            }
        }
        this.y = Math.max(0, Math.min(Game.MAX_Y - 1, this.y));
        this.x = Math.max(0, Math.min(Game.MAX_X - 1, this.x));
    }

    @Override
    protected char getShape() {
        return 'B';
    }
}
