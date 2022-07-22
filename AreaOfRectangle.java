
import java.util.*;

class AreaOfRectangle {
    double length, width, area;
    String color;

    Scanner sc = new Scanner(System.in);

    AreaOfRectangle() {
        length = sc.nextDouble();
        width = sc.nextDouble();
        color = sc.next();
        area = length * width;
        System.out.println("Area: " + area);
    }

}

class Demo {
    public static void main(String[] args) {
        AreaOfRectangle r1 = new AreaOfRectangle();
        AreaOfRectangle r2 = new AreaOfRectangle();
        if (r1.area == r2.area && r1.color == r2.color) {
            System.out.println(" Not Matching!!");
        } else {
            System.out.println(" Matching!!");
        }
    }
}