package soal2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Barang> koleksi = new LinkedList<>();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Simpan Barang\n2. Hapus Barang\n3. Lihat Koleksi\n4. keluar");
            int pilihan = s.nextInt();
            switch (pilihan) {
                case 1:
                    koleksi.add(new Barang());
                    break;
                case 2:
                    System.out.println("Masukkan nama barang yg ingin dihapus: ");
                    String namaBarang = s.nextLine();
                    ListIterator<Barang> it = koleksi.listIterator();
                    while (it.hasNext()) {
                        if (it.next().getAsal().equals(namaBarang)) {
                            it.remove();
                            System.out.println("Barang " + namaBarang + " Berhasil dihapus.");
                            break;
                        }
                    }
                case 3:
                    int jumlahBarang = 0;
                    System.out.println("Daftar Barang : ");
                    ListIterator<Barang> it2 = koleksi.listIterator();
                    while (it2.hasNext()) {
                        jumlahBarang++;
                        System.out.println(jumlahBarang + ". " + it2.next().toString());
                    }

                    break;
                case 4:
                    s.close();
                    System.exit(0);
                default:
                    System.out.println("salah input");
                    break;
            }
        }
    }
}
