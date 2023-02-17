import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz.");

        int sayiBirinci = input.nextInt();

        System.out.println("ikinci sayıyı giriniz.");

        int sayiIkinci = input.nextInt();

        int toplam = 0;

        for (int i = sayiBirinci + 1; i < sayiIkinci; i++) {

            if (i % 2 == 1) {

                toplam = toplam + i;

            }

        }

        System.out.println("İki sayı arasındaki tek sayıların toplamı : " + toplam);
    }
}
