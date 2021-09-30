package work_3;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center = new MovablePoint(0,0,0,0);

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString() {
        return "MovableCircle{" +
                "x=" + this.center.x +
                ", y=" + this.center.y +
                ", xSpeed=" + this.center.xSpeed +
                ", ySpeed=" + this.center.ySpeed +
                ", radius=" + radius +
                ", center=" + center +
                '}';
    }

    public void moveUp() {
        this.center.y+= this.center.ySpeed ;
    }
    public void moveDown() {
        this.center.y-= this.center.ySpeed ;
    }
    public void moveLeft() {
        this.center.x-= this.center.xSpeed ;
    }
    public void moveRight() {
        this.center.x+= this.center.xSpeed ;
    }
}