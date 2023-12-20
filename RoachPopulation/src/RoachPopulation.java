public class RoachPopulation {
    private int populasyon;

    public RoachPopulation(int baslangicPopulasyonu) {
        populasyon = baslangicPopulasyonu;
    }

    public void breed() {
        populasyon *= 2;
    }

    public void spray(double azalma) {
        populasyon = (int) (populasyon * (1 - azalma / 100));
    }

    public int getRoaches() {
        return populasyon;
    }
}
