package dir;
public class circle implements shape {
    private float radiusLength;
    public circle() {
    }
    @Override
    public void setside(float radius) {
        radiusLength = radius;
    }
    @Override
    public void getArea(){
        String msg=String.format("The area of Task1.circle is %f",radiusLength*radiusLength*Math.PI);
        System.out.println(msg);
    }
    @Override
    public void getPerimeter(){
        String msg=String.format("The peremeter of Task1.circle is %f",2*radiusLength*3.14);
        System.out.println(msg);
    }
}
