package lab3;

public class MovableRectangle implements Movable{
    private MovablePoint leftTop;
    private MovablePoint bottomRight;

    private boolean checkSpeedsY(){
        return this.leftTop.ySpeed == this.bottomRight.ySpeed;
    }
    private boolean checkSpeedsX(){
        return this.leftTop.xSpeed == this.bottomRight.xSpeed;
    }
    @Override
    public void moveUp() {
        if(checkSpeedsY()){
            this.leftTop.moveUp();
            this.bottomRight.moveUp();
        }else{
            System.out.println("Unable to move because point has different speeds");
        }
    }

    @Override
    public void moveDown() {
        if(checkSpeedsY()){
            this.leftTop.moveDown();
            this.bottomRight.moveDown();
        }else{
            System.out.println("Unable to move because point has different speeds");
        }
    }

    @Override
    public void moveLeft() {
        if(checkSpeedsX()){
            this.leftTop.moveLeft();
            this.bottomRight.moveLeft();
        }else{
            System.out.println("Unable to move because point has different speeds");
        }
    }

    @Override
    public void moveRight() {
        if(checkSpeedsX()){
            this.leftTop.moveRight();
            this.bottomRight.moveRight();
        }else{
            System.out.println("Unable to move because point has different speeds");
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "leftTop=" + leftTop +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
