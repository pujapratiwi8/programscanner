package latihan1;

import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName, asal;
        int umur, biayakos;

        System.out.println("selamat datang dikos widya 1,");
        System.out.print("nama anda ?");
        userName = sc.nextLine();

        System.out.print("asal dari mana ?");
        asal = sc.nextLine();

        System.out.print("umur: ");
        umur = sc.nextInt();

        System.out.print("biaya kos :");
        biayakos = sc.nextInt();

        //menampilan yang sudah disimpan divariabel
        System.out.println("-------------------------------");
        System.out.println("nama :" + userName);
        System.out.println("asal dari: " + asal);
        System.out.println("umur:" + umur);
        System.out.println("biaya kos:" + biayakos);
    }
}