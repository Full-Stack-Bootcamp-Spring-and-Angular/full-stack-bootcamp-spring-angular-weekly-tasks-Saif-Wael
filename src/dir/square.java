package dir;

public class square implements shape {
    private float sideLength;
    public square() {}
    @Override
    public void setside(float side){
        sideLength=side;
    }
    @Override
    public void getArea() {
        String msg=String.format("The area of a Task1.square is %f",sideLength*sideLength);
        System.out.println(msg);
    }
    @Override
    public void getPerimeter() {
        String msg=String.format("The perimeter of the Task1.square is %f",4*sideLength);
        System.out.println(msg);
    }


}
