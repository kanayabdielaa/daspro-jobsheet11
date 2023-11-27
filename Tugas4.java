import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Atlet {
    String nama;
    String cabangOlahraga;

    public Atlet(String nama, String cabangOlahraga) {
        this.nama = nama;
        this.cabangOlahraga = cabangOlahraga;
    }
}
public class Tugas4 {
    public static void main(String[] args) {
        List<Atlet> daftarAtlet = new ArrayList<>();

        tambahAtlet(daftarAtlet, "Badminton", 5);
        tambahAtlet(daftarAtlet, "Tenis Meja", 5);
        tambahAtlet(daftarAtlet, "Basket", 5);
        tambahAtlet(daftarAtlet, "Voli", 5);

        Collections.sort(daftarAtlet, (a1, a2) -> a1.nama.compareTo(a2.nama));

        tampilkanDataAtlet(daftarAtlet);
    }

    static void tambahAtlet(List<Atlet> daftarAtlet, String cabangOlahraga, int jumlah) {
        for (int i = 1; i <= jumlah; i++) {
            daftarAtlet.add(new Atlet("Atlet" + i + "_" + cabangOlahraga, cabangOlahraga));
        }
    }

    static void tampilkanDataAtlet(List<Atlet> daftarAtlet) {
        System.out.println("Data Atlet Porseni 2024:");
        for (Atlet atlet : daftarAtlet) {
            System.out.println("Nama: " + atlet.nama + ", Cabang Olahraga: " + atlet.cabangOlahraga);
        }
    }
}