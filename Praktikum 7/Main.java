public class Main {
    public static void main(String[] args) {
        Datum<Kucing> Kucing = new Datum<>(new Kucing());
        Datum<Anjing> Anjing = new Datum<>(new Anjing());
        Datum<Burung> Burung = new Datum<>(new Burung());

        ContohMetodeGenerik.tampilkanPerilaku(Kucing);
        ContohMetodeGenerik.tampilkanPerilaku(Anjing);
        ContohMetodeGenerik.tampilkanPerilaku(Burung);
    }
}
