package problemCollectionFramework.q11;

import java.util.Scanner;
import java.util.Vector;

public class GraphicEditor {

    private final static Scanner scanner = new Scanner(System.in);
    private final static Vector<Shape> shapeVector = new Vector<>();

    static void insert() {

        System.out.print("Line(1), Rect(2), Circle(3) >>");
        int shapeMenu = 0;
        try {
            shapeMenu = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("1에서 3사이의 정수로 입력해주세요.");
        }
        switch (shapeMenu) {
            case 1:
                shapeVector.add(new Line());
                break;
            case 2:
                shapeVector.add(new Rectangle());
                break;
            case 3:
                shapeVector.add(new Circle());
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }

    }

    static void delete() {
        System.out.print("삭제할 도형의 위치>>");
        int indexNum;
        try {
            indexNum = scanner.nextInt();

            if (indexNum < 1) {
                System.out.println("잘못된 입력입니다.");
            } else if (shapeVector.get(indexNum) == null) {
                System.out.println("삭제할 수 없습니다.");
            } else {
                shapeVector.remove(indexNum - 1);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("삭제할 수 없습니다.");
        } catch (Exception e) {
            System.out.println("정수로 입력해주세요");
        }

    }

    static void show() {
        for (Shape shape : GraphicEditor.shapeVector) {
            shape.draw();
        }
    }

    static void run() {
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>> ");
            int menuNum = 0;
            try {
                menuNum = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("1에서 3사이의 정수로 입력해주세요.");
            }
            switch (menuNum) {
                case 1:
                    insert();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다");
                    System.exit(0);
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    public static void main(String[] args) {

        GraphicEditor.run();


    }

}
