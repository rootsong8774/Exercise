package problemInheritance02.q04;

public class Fish extends GameObject {

    public Fish(Integer startX, Integer startY, Integer distance) {
        super(startX, startY, distance);
    }

    @Override
    protected void move() {
        int xplusMinus = (int) (Math.random()*3);
        if(xplusMinus ==0) x += distance;
        else if(xplusMinus==1) x-= distance;

        int yplusMinus = (int) (Math.random()*3);
        if(yplusMinus ==0) y += distance;
        else if(yplusMinus==1) y-= distance;

        this.y = Math.max(0, Math.min(Game.MAX_Y-1, this.y));
        this.x = Math.max(0, Math.min(Game.MAX_X-1, this.x));
    }

    @Override
    protected char getShape() {
        return '@';
    }
}
