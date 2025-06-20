
import java.util.ArrayList;


public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira") ; 
        Pegawai pegawai2 = new Manajer("Joko") ; 
        Manajer pegawai3 = new Manajer("Argo") ;

        ArrayList<Pegawai> emps = new ArrayList<Pegawai>() ;
        emps.add(pegawai) ;
        emps.add(pegawai2) ;
        emps.add(pegawai3) ;
    
        System.out.println("\nNama : Steven Jonathan Sihombing");
        System.out.println("NIM : 24060123120044");
        System.out.println("");
        for (Pegawai emp : emps){
            emp.tampilData() ;
        }

        // No 2 .Menyederhanakan logika program, misalnya saat memanggil method 
        // tampilData() dari berbagai jenis pegawai, kita cukup menggunakan satu referensi Pegawai tanpa perlu tahu jenis objek spesifiknya

        // No 3 Harus membuat variabel berbeda untuk tiap tipe pegawai yang membuat kode tidak efisien.
    }
}