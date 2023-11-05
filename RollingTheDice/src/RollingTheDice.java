import java.util.Random;

public class RollingTheDice {
    private static final int LARGEST_NUMBER = 6;
    private static final int SMALLEST_NUMBER = 1;
    private static final int INVALID_NUMBER = 0;

    private int number;
    private Random random;

    public RollingTheDice() {
        random = new Random();
        rollTheDice(); //sayi = INVALID_NUMBER; can also be written
        //sayi = INVALID_NUMBER;
    }

    public void rollTheDice() {
        number = random.nextInt(LARGEST_NUMBER - SMALLEST_NUMBER + 1) + SMALLEST_NUMBER;
    }

    public int getNumber() {
        return number;
    }
}
