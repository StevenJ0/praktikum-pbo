public class Burung extends Anabul{

    public Burung (String nama){
        this.setNama(nama);
    }
    @Override
    public void bersuara() {
        System.out.println("Suara burung : cuit");
    }

    @Override
    public void bergerak() {
        System.out.println("Gerak burung : terbang");
    }
}