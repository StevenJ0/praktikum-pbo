public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void bersuara();
    public abstract void bergerak();

    public String getNama() {
        return nama;
    }

    public void showInfo() {
        System.out.println("Nama: " + nama);
        bersuara();
        bergerak();
    }
}