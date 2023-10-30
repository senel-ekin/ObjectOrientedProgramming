public class ElementsTest {
    public static void main(String[] args) {
        Elements element1 = new Elements("Hydrogen", 1, "H", 1.008, 1, 1);
        Elements element2 = new Elements("Gold", 79, "Au", 197.0, 6, 11);
        Elements element3 = new Elements("Oxygen", 8, "O", 16.0, 2, 16);

        element1.PrintElement();
        element2.PrintElement();
        element3.PrintElement();
    }
}
