import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] dersler = {"Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik"};
        int toplamPuan = 0;

        for (int i = 0; i < dersler.length; i++) {
            System.out.print(dersler[i] + " puanını giriniz: ");
            int puan = input.nextInt();
            toplamPuan += puan;
        }

        double ortalama = (double) toplamPuan / dersler.length;

        String durum = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println("Ortalama: " + ortalama);
        System.out.println(durum);
    }
}