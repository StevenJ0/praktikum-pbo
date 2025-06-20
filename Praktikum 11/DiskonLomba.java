// Nama : Steven Jonathan Sihombing
// NIM  : 24060123120044
// Tanggal : 2 Juni 2025

interface IDiskon {
    public double hitungDiskon(int totalHarga);
}

public class DiskonLomba {
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon () {
            public double hitungDiskon(int totalHarga) {
                return  totalHarga - (totalHarga * 0.3);
            }
        } ; 

        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4) ;

        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        } ;

        System.out.println("Diskon Merdeka = " + diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran = " + diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa = " + diskonBiasa.hitungDiskon(45000));
    }

}