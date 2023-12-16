public class Test01 {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        System.out.println(c1.toString());
        System.out.println(c1.getPerimeter());
        c1.printCircle();
        DisplayObject(new Circle(3,"red",true));
    }

    public static void DisplayObject(GeometricObject object) {
        System.out.println("Created on: " + object.getDateCreated()+
                "\nColor of the object: " + object.getColor());
    }
}
