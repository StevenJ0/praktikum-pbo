// Nama : Steven Jonathan Sihombing
// NIM  : 24060123120044
// Tanggal : 2 Juni 2025


import java.util.HashMap;
import java.util.Map;

public class Latihan {
    public static void main(String[] args) {
        Map<Integer, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put(1, "Adi");
        mahasiswaMap.put(2, "Bambang");
        mahasiswaMap.put(3, "Cici");
        mahasiswaMap.put(4, "Didi");
        mahasiswaMap.put(5, "Eka");

        System.out.println("================================== Tanpa Block Statement ==================================");
        mahasiswaMap.forEach((key, value) -> System.out.println("NIM : " + key + " dengan Nama :  " + value));
        System.out.println("================================== Dengan Block Statement ==================================");
        mahasiswaMap.forEach((key, value) -> {
            System.out.println("NIM : " + key + " dengan Nama :  " + value);
        });
        
    }
}