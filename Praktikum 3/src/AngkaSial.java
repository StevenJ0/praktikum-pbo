// File : AngkaSial.java
// Nama : Steven Jonathan Sihombing
// NIM : 24060123120044


public class AngkaSial{
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException() ;
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial() ;
        try {
            as.cobaAngka(10) ;
            as.cobaAngka(13) ;
            as.cobaAngka(12) ;
        } catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }

}

// Jawaban :  Ketika eksepsi terjadi maka angka 12 tidak akan dieksekusi karena sudah menglaami catch pada saat menjalankan yang 13
// Baris 21 dieksekusi karena mengalami error pada angka 13