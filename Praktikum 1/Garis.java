// Nama File : Garis.java
// Deskripsi : berisi atribut dan method dalam class garis
// Pembuat : Steven Jonathan Sihombing
// Tanggal : 22 Februari 2025

public class Garis {
    Titik titikAwal, titikAkhir ;
    static int counterGaris = 0 ;

    Garis(){
        this.titikAwal = new Titik(0,0) ;
        this.titikAkhir = new Titik(1,1) ;
        counterGaris++ ;
    }

    Garis(Titik T1, Titik T2) {
        this.titikAwal = T1 ;
        this.titikAkhir = T2 ;
        counterGaris++ ;
    }

    Titik getTitikAwal(){
        return this.titikAwal ;
    }

    Titik getTitikAkhir(){
        return this.titikAkhir ;
    }

    void setTitikAwal(Titik X){
        this.titikAwal = X ;
    }

    void setTitikAkhir(Titik Y){
        this.titikAkhir = Y ;
    }

    double getPanjangGaris(){
        return this.titikAwal.getJarakTitik(this.titikAkhir) ;
    }

    double getGradienGaris(){
        return (this.titikAkhir.ordinat - this.titikAwal.ordinat) / (this.titikAkhir.absis - this.titikAwal.absis) ;
    }

    Titik getTitikTengahGaris(){
        Titik T = new Titik() ;
        T.absis = (this.titikAwal.absis + this.titikAkhir.absis) / 2 ;
        T.ordinat = (this.titikAwal.ordinat + this.titikAkhir.ordinat) / 2 ;
        return T ;
    }

    boolean isSejajar(Garis G) {
        return this.getGradienGaris() == G.getGradienGaris() ;
    }

    boolean isTegakLurus(Garis G) {
        return this.getGradienGaris() * G.getGradienGaris()  == -1 ;
    }

    void printTitikAwal() {
        System.err.println("Titik awal : (" + this.titikAwal.absis + "," + this.titikAwal.ordinat + ")") ;
    }

    void printTitikAkhir() {
        System.err.println("Titik akhir : (" + this.titikAkhir.absis + "," + this.titikAkhir.ordinat + ")") ;
    }

    void getPersamaanGaris() {
        double m = this.getGradienGaris() ;
        double b = this.titikAwal.ordinat - m * this.titikAwal.absis ;
        System.err.println("Persamaan garis : y = " + m + " x + " + b) ;
    }
}