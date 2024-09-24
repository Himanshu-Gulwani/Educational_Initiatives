
import java.util.Scanner;
interface Shape {
    public void draw();
}
class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
        System.out.println("Circle Drawn!!");
    }
}
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle...");
        System.out.println("Rectangle Drawn!!");
    }
}
class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Square...");
        System.out.println("Square Drawn!!");
    }
}


class ShapeMaker {
    Shape c = new Circle();
    Shape r = new Rectangle();
    Shape s = new Square();



    public void drawCircle(){
        c.draw();
    }

    public void drawRectangle(){
        r.draw();
    }

    public void drawSquare(){
        s.draw();
    }
}



public class FacadeDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the shape :");
        String Shapename = sc .next();
        String shape;
        do {

            


            ShapeMaker sm = new ShapeMaker();
            System.out.println("Enter the  Shape you want to create : ");
            shape= sc.nextLine();
            if (shape.equalsIgnoreCase("circle")){
                sm.drawCircle();
            } else if (shape.equalsIgnoreCase("Rectangle")) {
                sm.drawRectangle();
            }
            else if(shape.equalsIgnoreCase("Square")) {
                sm.drawSquare();
            }
        }while (Shapename.equalsIgnoreCase("Done"));

    }
}
