package soal1;

public class Main {
    public static void main(String[] args) {
        BackStack simulasi = new BackStack();
        simulasi.mulai();
        simulasi.maju("Detail");
        simulasi.maju("Favorit");
        simulasi.mundur();

        simulasi.maju("Detail");
        simulasi.maju("Favorit");
        simulasi.mundur();
        simulasi.mundur();
        simulasi.mundur();

        simulasi.history();
    }
}