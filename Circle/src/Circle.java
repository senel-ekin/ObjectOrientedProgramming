public class Circle {
    private double radius;
    public static final int INVALID_DATA = -1;

    public Circle(double r){
        setRadius(r);
    }

    public double areaCalculate(){
        double result = INVALID_DATA;
        if(isTheRadiusValid())
            result = Math.PI * radius * radius;
        return result;
    }

    public double circumferenceCalculate(){
        double result = INVALID_DATA;
        if(isTheRadiusValid())
            result = 2 * Math.PI * radius;
        return result;
    }

    public double getRadius(){
        return radius;
    }

    private boolean isTheRadiusValid(){
        return radius != INVALID_DATA;
    }

    public void setRadius(double r){
        if (r > 0)
            radius = r;
        else
            radius = INVALID_DATA;
    }
}