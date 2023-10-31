public class BicycleRegistration {
    public static void main(String[] args) {
        Bicycle bike1, bike2;
        String owner1, owner2;

        bike1 = new Bicycle();
        bike1.setOwnerName("Phoebe Buffay");

        bike2 = new Bicycle();
        bike2.setOwnerName("Ross Geller");

        owner1 = bike1.getOwnerName();
        owner2 = bike2.getOwnerName();

        System.out.println(owner1 + " owns a bicycle pink, and it had a rainbow colored tassels " +
                "hanging off the handle grips, and-and-and a bell, " +
                "and this big white wicker basket with those plastic daisies stuck on.");
        System.out.println(owner2 + " gifted to her");
    }
}
