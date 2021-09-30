package work_3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft = new MovablePoint(0,0,0,0), bottomRight = new MovablePoint(0,0,0,0);

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft.x = x1;
        this.topLeft.y = y1;
        this.topLeft.xSpeed = xSpeed;
        this.topLeft.ySpeed = ySpeed;
        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.bottomRight.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;
    }

    private Boolean checkSpeed() {
        if ((this.bottomRight.xSpeed == this.topLeft.xSpeed) && (this.bottomRight.ySpeed == this.topLeft.ySpeed))
        return true;
        else return false;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public void moveUp() {
        this.topLeft.y+= topLeft.ySpeed;
        this.bottomRight.y+= bottomRight.ySpeed;
    }
    public void moveDown() {
        this.topLeft.y-= topLeft.ySpeed;
        this.bottomRight.y-= bottomRight.ySpeed;
    }
    public void moveLeft() {
        this.topLeft.x+= topLeft.xSpeed;
        this.bottomRight.x+= bottomRight.xSpeed;
    }
    public void moveRight() {
        this.topLeft.x-= topLeft.xSpeed;
        this.bottomRight.x-= bottomRight.xSpeed;
    }
}
