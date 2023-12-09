public class CircleWithStaticMembers {
    private double radius = 1;
    private static int numberOfObjects = 0;

    public CircleWithStaticMembers() {
        numberOfObjects++;
    }

    public CircleWithStaticMembers(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }
}
