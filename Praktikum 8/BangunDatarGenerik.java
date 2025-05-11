public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangun;

    public BangunDatarGenerik(T bangun) {
        this.bangun = bangun;
    }

    public double luas() {
        return bangun.hitungLuas();
    }

    public double keliling() {
        return bangun.hitungKeliling();
    }
}
