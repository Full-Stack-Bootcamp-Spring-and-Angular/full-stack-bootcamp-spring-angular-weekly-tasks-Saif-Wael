package dir;

public class Square implements Shape {
    private Draw2D draw2D;
    public Square() {}

    public void setDrawing(Draw2D draw2D){
        this.draw2D=draw2D;
    }
    @Override
    public void draw() {
        draw2D.draw("Rectangle");
    }


}
