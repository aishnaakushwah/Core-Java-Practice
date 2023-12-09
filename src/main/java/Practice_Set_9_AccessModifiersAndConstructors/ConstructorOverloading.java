package Practice_Set_9_AccessModifiersAndConstructors;

// Q2. Overload a constructor used to initialize a rectangle of length 4 and breath 5 for using custom parameters.

class Rectangle {
    float length;
    float breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float getLength() {
        return length;
    }

    public float getBreadth() {
        return breadth;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());
    }
}