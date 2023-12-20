public class RoachSimulation {
    public static void main(String[] args) {
        RoachPopulation roachPopulation = new RoachPopulation(10);

        for (int i = 1; i <= 3; i++){
            System.out.println("Simülasyon " + i + ":");

            roachPopulation.breed();
            System.out.println("Üreme sonrası hamamböceği sayısı: " + roachPopulation.getRoaches());

            roachPopulation.spray(10);
            System.out.println("Spray sonrası hamamböceği sayısı: " + roachPopulation.getRoaches());

            System.out.println();
        }
    }
}
