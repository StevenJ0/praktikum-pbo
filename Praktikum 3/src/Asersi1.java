// File : Asersi1.java
// Nama : Steven Jonathan Sihombing
// NIM : 24060123120044
// Deskripsi : Program untuk menunjukkan asersi

public class Asersi1 {
    public static void main(String[] args) {
        int x = 0 ;
        if(x > 0){
            System.err.println("x bilangan positif");
        } else {
            assert x < 0 : "ada kesalahan kode";
            System.err.println("x bilangan negatif");
        }
    }
}