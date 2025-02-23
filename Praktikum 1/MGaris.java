// Nama File : MGaris.java
// Deskripsi : berisi atribut dan method dalam class garis
// Pembuat : Steven Jonathan Sihombing
// Tanggal : 22 Februari 2025

public class MGaris {
    public static void main(String[] args) {

        Titik T1 = new Titik(1,1) ; 
        Titik T2 = new Titik(2,2) ;

        Garis G1 = new Garis() ;
        G1.getTitikAwal().printTitik() ;

        Garis G2 = new Garis(T1, T2) ;
        G2.getTitikAkhir().printTitik() ;

        System.out.println("Panjang Garis : " + G2.getPanjangGaris()) ;

        System.out.println("Gradien Garis : " + G2.getGradienGaris()) ;

        System.err.println("Apakah sejajar : " + G2.isSejajar(G1)) ;
        System.err.println("Apakah sejajar : " + G2.isTegakLurus(G1)) ;

        // set Titik Awal 
        Titik T3 = new Titik(3,3) ;
        G2.setTitikAwal(T3) ;
        G2.getTitikAwal().printTitik() ;

        // Set Titik Akhir 
        Titik T4 = new Titik(4,4) ;
        G2.setTitikAkhir(T4) ;
        G2.getTitikAkhir().printTitik() ;

        // Titik Tengah Garis 
        G2.getTitikTengahGaris().printTitik() ;

        // Print titik awal 
        G2.printTitikAwal() ;

        // Print titik akhir 
        G2.printTitikAkhir() ;

        // Persamaan Garis 
        G2.getPersamaanGaris() ;
    }
}