public class Kucing extends Anabul {

    public Kucing(String nama) {
        this.setNama(nama);
    }

    @Override
    public void bersuara() {
        System.out.println("Suara kucing : Meong");
    }

    @Override
    public void bergerak() {
        System.out.println("Gerak kucing : Melata");
    }
}