public class TemperatureTest {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.input();

        System.out.println("Temperature in Celcius:" + temp.toCelsius());

    }
}
