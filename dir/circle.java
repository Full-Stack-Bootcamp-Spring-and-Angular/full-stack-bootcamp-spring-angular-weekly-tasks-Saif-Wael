package dir;
public class circle implements shape {
    private double radiusLength;
    public circle() {

    }
    @Override
    public void setside(double radius) {
        radiusLength = radius;
    }
    @Override
    public void getArea(){
        System.out.println("The area of Task1.circle is "+radiusLength*radiusLength*Math.PI);
    }
    @Override
    public void getPerimeter(){
        System.out.println("The peremeter of Task1.circle is "+2*radiusLength*3.14);
    }
}
