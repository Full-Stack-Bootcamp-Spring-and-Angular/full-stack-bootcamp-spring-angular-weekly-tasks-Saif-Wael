import dir.Draw2D;
import dir.Circle;
import dir.Square;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import part2.Car;
import part2.Plane;
import part2.Vehicle;

public class Main {
    public static void main(String[] args) {

        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("-----------------------Part 1-----------------------------");
        Circle circle = container.getBean("circle", Circle.class);
        circle.draw();
        Square square = container.getBean("square", Square.class);
        Draw2D draw2D =new Draw2D();
        square.setDrawing(draw2D);
        square.draw();
        System.out.println("-----------------------Part 2-----------------------------");
        Vehicle car = container.getBean("car", Car.class);
        car.storeVehicle();
        Vehicle plane = container.getBean("plane", Plane.class);
        plane.storeVehicle();
    }
}