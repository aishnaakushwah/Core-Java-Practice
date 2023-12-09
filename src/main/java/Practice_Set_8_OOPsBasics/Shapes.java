package Practice_Set_8_OOPsBasics;

// Q3. Create a class Square, Rectangle and Circle with a method to initialize its side, calculating area, perimeter etc.

class Square {
    float side;
    public float Area(){
        return side*side;
    }
    public float Perimeter(){
        return 4*side;
    }
    public void display(){
        System.out.println("SQUARE");
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }
}

class Rectangle {
    float length;
    float breadth;
    public float Area(){
        return length*breadth;
    }
    public float Perimeter(){
        return 2*(length+breadth);
    }
    public void display(){
        System.out.println("\nRECTANGLE");
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }
}

class Circle {
    float radius;
    public float Area(){
        return (float) (3.14*radius*radius);
    }
    public float Perimeter(){
        return (float) (2*3.14*radius);
    }
    public void display(){
        System.out.println("\nCIRCLE");
        System.out.println("Area: " + Area());
        System.out.println("Perimeter: " + Perimeter());
    }
}

public class Shapes {
    public static void main(String[] args) {

        Square sq = new Square();
        sq.side = 3;
        sq.display();

        Rectangle rec = new Rectangle();
        rec.length = 3;
        rec.breadth = 4;
        rec.display();

        Circle cir = new Circle();
        cir.radius = 6;
        cir.display();
    }
}