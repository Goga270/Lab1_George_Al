package lab3;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    MovablePoint(int x,int y,int xSpeed,int ySpeed){
        this.x = x;
        this.xSpeed = xSpeed;
        this.y = y;
        this.ySpeed = ySpeed;
    }

    public void moveUp(){
        this.y +=ySpeed;
    }

    public void moveDown(){
        this.y -=ySpeed;
    }

    public void moveLeft(){
        this.x -=xSpeed;
    }

    public void moveRight(){
        this.x +=xSpeed;
    }

    @Override
    public String toString(){
        return ("Позиция точки x:" + this.x + ", y:" + this.y + "Скорость по x:" + this.xSpeed + ". Скорость по y:" + this.ySpeed);
    }
}
