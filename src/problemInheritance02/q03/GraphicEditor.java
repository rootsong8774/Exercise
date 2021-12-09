package problemInheritance02.q03;

import java.util.Scanner;

public class GraphicEditor {

    private final String name;
    private final Scanner scanner = new Scanner(System.in);
    private Shape start = null, end = null;

    public GraphicEditor(String name) {
        this.name = name;
    }

    public void insert(Shape newShape) {
        if (start == null) {
            start = end = newShape;
        } else {
            end.setNext(newShape);
            end = newShape;

        }
    }

    public void delete(Integer index) {

        Shape currentShape = start, previousShape = start;
        for (int i = 0; i < index; i++) {
            previousShape = currentShape;
            currentShape = currentShape.getNext();
            if (currentShape == null) {
                return;
            }
        }
        if (start == null) {
            System.out.println("삭제할 수 없습니다.");
            return;
        }
        if (start == end) {
            start = end = null;
        } else if (currentShape == end) {
            end = previousShape;
            end.setNext(null);
        } else {
            previousShape.setNext(currentShape.getNext());
        }

    }

    public void show() {
        Shape p = start;
        while (p != null) {
            p.draw();
            p = p.getNext();
        }
    }


    public void run() {
        System.out.println( name+ "를 실행합니다.");
        Outer:
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두보기(3), 종료(4)>>");
            int menuNum = scanner.nextInt();
            switch (menuNum) {
                case 1:
                    Shape newShape = null;
                    System.out.print("Line(1), Rectangle(2), Circle(3)>>");
                    int insertNum = scanner.nextInt();
                    switch (insertNum) {
                        case 1:
                            newShape = new Line();
                            break;
                        case 2:
                            newShape = new Rectangle();
                            break;
                        case 3:
                            newShape = new Circle();
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                    }
                    insert(newShape);
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    int index = scanner.nextInt();
                    delete(index);
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    System.out.println("그래픽 에디터를 종료합니다.");
                    break Outer;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요");
            }
        }
    }

    public static void main(String[] args) {
        GraphicEditor ge = new GraphicEditor("MyGraphicEditor");
        ge.run();
    }

}

