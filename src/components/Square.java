package components;

public class Square implements Shape {
    private Draw3D draw3D;
    public void setDraw3d(Draw3D draw3d) { this.draw3D = draw3d; }
    @Override
    public void draw() {
        System.out.println("In Square RN");
        draw3D.draw();
    }
}
