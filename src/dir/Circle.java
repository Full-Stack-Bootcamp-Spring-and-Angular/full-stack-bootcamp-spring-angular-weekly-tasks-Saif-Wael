package dir;
public class Circle implements Shape {
    private Draw2D draw2D;

    public Circle(Draw2D draw2D) {
        this.draw2D = draw2D;
    }
    public void draw(){
        draw2D.draw("circle");
    }
}
