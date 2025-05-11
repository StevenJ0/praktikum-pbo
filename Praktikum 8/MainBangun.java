public class MainBangun {
    public static void main(String[] args) {
        BangunDatarGenerik<Persegi> persegi = new BangunDatarGenerik<>(new Persegi(4));
        System.out.println("Luas persegi: " + persegi.luas());
        System.out.println("Keliling persegi: " + persegi.keliling());

        BangunDatarGenerik<PersegiPanjang> pp = new BangunDatarGenerik<>(new PersegiPanjang(5, 3));
        System.out.println("Luas persegi panjang: " + pp.luas());
        System.out.println("Keliling persegi panjang: " + pp.keliling());

        BangunDatarGenerik<Segitiga> segitiga = new BangunDatarGenerik<>(new Segitiga(3, 4));
        System.out.println("Luas segitiga: " + segitiga.luas());
        System.out.println("Keliling segitiga: " + segitiga.keliling());
    }
}
