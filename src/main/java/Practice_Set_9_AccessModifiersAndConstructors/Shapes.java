package Practice_Set_9_AccessModifiersAndConstructors;

/* Q1. Create a class for cube, cuboid, cylinder and sphere.
        Create constructor for instance variables.
        Create getter/setters.
        Calculate surface area and volume.                        */

class Cube {
    float side;

    public Cube(float side) {
        this.side = side;
    }

    public float SurfaceArea(){
        return 6*side*side;
    }
    public float Volume(){
        return side*side*side;
    }
    public void display(){
        System.out.printf("%-15s %-20s %-10s\n", "Cube", SurfaceArea(), Volume());
    }
}

class Cuboid {
    float length;
    float breadth;
    float height;

    public Cuboid(float length, float breadth, float height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public float SurfaceArea(){
        return 2*(length*breadth + breadth*height + length*height);
    }
    public float Volume(){
        return length*breadth*height;
    }
    public void display(){
        System.out.printf("%-15s %-20s %-10s\n", "Cuboid", SurfaceArea(), Volume());
    }
}

class Cylinder {
    float radius;
    float height;

    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float SurfaceArea(){
        return 2*3.14f*radius*(radius+height);
    }
    public float Volume(){
        return 3.14f*radius*radius*height;
    }
    public void display(){
        System.out.printf("%-15s %-20s %-10s\n", "Cylinder", SurfaceArea(), Volume());
    }
}

class Sphere {
    float radius;

    public Sphere(float radius) {
        this.radius = radius;
    }

    public float SurfaceArea(){
        return 4*3.14f*radius*radius;
    }
    public float Volume(){
        return (4/3f)*3.14f*radius*radius*radius;
    }
    public void display(){
        System.out.printf("%-15s %-20s %-10s\n", "Sphere", SurfaceArea(), Volume());
    }
}

public class Shapes {
    public static void main(String[] args) {

        System.out.printf("%-15s %-20s %-10s\n", "Shapes", "Surface Area", "Volume");
        System.out.println("-------------------------------------------------");

        Cube cu = new Cube(5);
        cu.display();

        Cuboid cb = new Cuboid(5,6,7);
        cb.display();

        Cylinder cy = new Cylinder(5,6);
        cy.display();

        Sphere sp = new Sphere(5);
        sp.display();

    }
}
