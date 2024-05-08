package soal2;

import java.util.*;

public class Barang {
    private String asal;
    private String nama;
    private int tahun;
    private String jenis;

    public Barang() {
        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan Asal Barang: ");
        asal = s.nextLine();
        System.out.println("Masukkan Nama Pengoleksi: ");
        nama = s.nextLine();
        System.out.println("Masukkan Tahun Pembuatah: ");
        tahun = s.nextInt();
        System.out.println("Masukkan Jenis Barang: vas, jam, guci,");
        jenis = s.next();
    }

    public String toString() {
        return "asal = " + asal + ", nama = " + nama + ", tahun = " + tahun + ", jenis = " + jenis;
    }

    public String getAsal() {
        return asal;
    }

    public String getJenis() {
        return jenis;
    }

}
