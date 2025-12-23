package dir;

public class square implements shape {
    private double sideLength;
    public square() {}
    @Override
    public void setside(double side){
        sideLength=side;
    }
    @Override
    public void getArea() {
        System.out.println("The area of a square is "+sideLength*sideLength);
    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter of a square is "+sideLength*4);
    }


}
