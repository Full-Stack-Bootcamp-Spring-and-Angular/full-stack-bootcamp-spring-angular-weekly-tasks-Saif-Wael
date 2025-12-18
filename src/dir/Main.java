package dir;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
        shape circle = (circle) container.getBean("circleTest", circle.class);
        shape square=  (square) container.getBean("squareTest", square.class);
        float length=sc.nextFloat();
        circle.setside(length);
        square.setside(length);
        circle.getArea();
        square.getArea();
    }
}