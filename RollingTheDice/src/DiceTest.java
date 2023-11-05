public class DiceTest {
    public static void main(String[] args) {
        RollingTheDice dice01 = new RollingTheDice();

        dice01.rollTheDice();
        System.out.println("First dice roll: " + dice01.getNumber());

        dice01.rollTheDice();
        System.out.println("Second dice roll: " + dice01.getNumber());

        dice01.rollTheDice();
        System.out.println("Third dice roll: " + dice01.getNumber());
    }
}
