package components;


public class Circle implements Shape{
    private Draw2D draw2D;
    public Circle(Draw2D draw2d) {
        this.draw2D = draw2d;
    }
    @Override
    public void draw() {
        System.out.println("In Circle RN");
        draw2D.draw();
    }
}
