package problemInheritance02.q04;

import java.util.Objects;

public abstract class GameObject {

    protected Integer distance; // 한 번 이동 거리
    protected Integer x, y; // 현재 위치(화면 맵 상의 위치)

    public GameObject(Integer startX, Integer startY, Integer distance) { // 초기 위치와 이동 거리 설정
        this.x = startX;
        this.y = startY;
        this.distance = distance;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public boolean collide(GameObject p) { // 이 객체가 객체 p와 충돌했으면 true 리턴
        return Objects.equals(this.x, p.getX()) && Objects.equals(this.y, p.getY());
    }

    protected abstract void move(); // 이동한 후의 새로운 위치로 x, y 변경

    protected abstract char getShape(); // 객체의 모양을 나타내는 문자 리턴
}
