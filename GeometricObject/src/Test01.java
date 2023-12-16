public class Test01 {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        System.out.println(c1.toString());
        System.out.println(c1.getPerimeter());
        c1.printCircle();
        DisplayObject(new Circle(3,"red",true));
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        DisplayObject(new Rectangle(3,5,"yellow",false));
        Triangle t1 = new Triangle();
        System.out.println(t1.toString());
        DisplayObject(new Triangle(1,1.5,1,"yellow",true));
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getArea());
    }

    public static void DisplayObject(GeometricObject object) {
        System.out.println("Created on: " + object.getDateCreated()+
                "\nColor of the object: " + object.getColor());
    }
}
