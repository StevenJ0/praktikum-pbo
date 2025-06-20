// Nama : Steven Jonathan Sihombing
// NIM  : 24060123120044
// Tanggal : 2 Juni 2025

import java.util.ArrayList;
import java.util.Map;


public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<String>();
        mahasiswaList.add("Adi") ; 
        mahasiswaList.add("Bambang") ; 
        mahasiswaList.add("Cici") ;
        mahasiswaList.add("Didi") ; 

        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}