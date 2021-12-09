package problemInheritance02.q04;

public class Game {

    public static final Integer MAX_X = 20;
    public static final Integer MAX_Y = 10;

    char[][] map = new char[MAX_Y][MAX_X];
    GameObject[] character = new GameObject[2];


    public Game() {
        for (int i = 0; i < MAX_Y; i++) {
            for (int j = 0; j < MAX_X; j++) {
                map[i][j] = '-';
            }
        }
        int fishStartX = (int) (Math.random()*20);
        int fishStartY = (int) (Math.random()*10);
        int bearStartX = (int) (Math.random()*20);
        int bearStartY = (int) (Math.random()*10);
        character[0] = new Fish(fishStartX, fishStartY, 1);
        character[1] = new Bear(bearStartX, bearStartY, 1);

    }

    public void run() {
        System.out.println("*** Bear wants to catch the fish***");
        update();
        draw();

        while (true) {

            clear();
            character[0].move();
            character[1].move();
            update();
            draw();

            if (character[0].collide(character[1])) {
                System.out.println("물고기를 잡았습니다.");
                System.out.println("게임 종료");
                break;
            }

        }

    }

   /* public void run() {
        System.out.println("*** Bear wants to catch the fish***");

        Game game = new Game();
        game.update();
        game.draw();

        while (!game.doesEnd()) {

            game.clear();
            game.character[0].move();
            game.character[1].move();
            game.update();
            game.draw();

        }
        System.out.println("물고기를 잡았습니다.");
        System.out.println("게임 종료");

    }

    public boolean doesEnd() {
        return character[0].collide(character[1]);
    }*/


    public void update() {
        for (GameObject go : character) {
            map[go.getY()][go.getX()] = go.getShape();
        }
    }

    private void clear() {
        for (GameObject go : character) {
            map[go.getY()][go.getX()] = '-';
        }
    }

    private void draw() {
        System.out.println();
        for (int i = 0; i < MAX_Y; i++) {
            for (int j = 0; j < MAX_X; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Game game = new Game();
        game.run();

    }


}
