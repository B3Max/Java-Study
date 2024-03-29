package work_2;

public class Ball {
    private double x = 0, y = 0;
    private double speed = 0;

    public Ball () {}

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setXYSpeed(double speed) {
        this.speed = speed;
    }

    public void move( double xDisp, double yDisp) {
        x+=xDisp;
        y+=yDisp;
    }

    @Override
    public String toString()
    {
        return "Work_2.Ball @ (" + this.x + ", " + this.y + ").";
    }
}
