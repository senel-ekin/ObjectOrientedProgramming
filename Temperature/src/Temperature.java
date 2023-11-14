import java.util.Scanner;

public class Temperature {
    private double fahrenheit;

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        fahrenheit = scanner.nextDouble();
    }

    public double toFahrenheit() {
        return fahrenheit;
    }

    public double toCelsius() {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public void setFahrenheit(double newTemperature) {
        fahrenheit = newTemperature;
    }

    public void setCelsius(double newTemperature) {
        fahrenheit = (newTemperature * 9.0 / 5.0) + 32;
    }

}
