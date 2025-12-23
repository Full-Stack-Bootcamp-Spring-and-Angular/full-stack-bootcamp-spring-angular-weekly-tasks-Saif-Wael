import components.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("Task3.xml");

        Shape circle = context.getBean("circle", Circle.class);
        circle.draw();

        Shape square = context.getBean("square", Square.class);
        square.draw();

        context.getBean("databaseOp", DatabaseOperation.class);
        context.close();
    }
}