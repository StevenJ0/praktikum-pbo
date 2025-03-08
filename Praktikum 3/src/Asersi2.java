// File : Asersi2.java
// Nama : Steven Jonathan Sihombing 
// NIM : 24060123120044
// Deskripsi : Program untuk menunjukkan asersi

import java.util.Scanner ;

class Lingkaran{
    private double jariJari ; 
    public Lingkaran ( double jariJari ){
        this.jariJari = jariJari ;
    }
    public double hitungKeliling(){
        double Keliling = 2 * Math.PI * jariJari ;
        return Keliling ;
    }
}

public class Asersi2{
    public static void main(String[] args) {
        double jariJari = new Scanner(System.in).nextDouble() ;
        assert jariJari > 0 : "jari-jari tidak boleh nnol" ;
        Lingkaran l1 = new Lingkaran(jariJari) ;
        double kelilingLingkaran = l1.hitungKeliling() ;
        System.out.println("Keliling lingkaran = " + kelilingLingkaran) ;
    }
}

// Jawaban : Kesalahan konsep di atas adalah ketika jari-jari bernilai 0, program tetap membuat objek Lingkaran.
// Hal ini terjadi karena assert tidak aktif secara default, sehingga pengecekan tidak mencegah pembuatan objek.
// Akibatnya, program tetap berjalan meskipun nilai jari-jari tidak valid.