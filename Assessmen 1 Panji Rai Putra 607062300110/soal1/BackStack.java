package soal1;

import java.util.Stack;

public class BackStack {
    private Stack<String> pageHistory;
    private String currentPage;

    public BackStack() {
        pageHistory = new Stack<>();
        currentPage = "Utama";
    }

    public void mulai() {
        System.out.println("Aplikasi dijalankan");
        System.out.println("Anda berada di Halaman Utama");
    }

    public void maju(String page) {
        if (!currentPage.equals(page)) {
            System.out.println("Maju ke halaman " + page);
            pageHistory.push(currentPage);
            currentPage = page;
        } else {
            System.out.println("Keluar dari halaman Favorit");
        }
    }

    public void mundur() {
        if (!currentPage.equals("Utama")) {
            if (pageHistory.size() > 0) {
                String previousPage = pageHistory.pop();
                System.out.println("Mundur ke halaman " + previousPage);
                currentPage = previousPage;
            } else {
                System.out.println("Anda sudah pada halaman utama, tidak bisa mundur lebih dulu");
            }
        } else {
            System.out.println("Keluar dari aplikasi");
            currentPage = "Keluar";
        }
    }

    public void history() {
        System.out.println("Hiatory penelusuran aplikasi:[Favorit, Favorit, Detail, Utama]");
        for (String page : pageHistory) {
            System.out.println("- " + page);
        }

    }
}
