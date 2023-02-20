package ders06_IfElseStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {
        // Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin. NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ay isminin bir harfini giriniz: ");
        char ilkHarf = scanner.next().charAt(0);

        if (ilkHarf == 'o' || ilkHarf == 'O')
            System.out.println("Ocak");

        if (ilkHarf == 's' || ilkHarf == 'S')
            System.out.println("Şubat");

        if (ilkHarf == 'm' || ilkHarf == 'M')
            System.out.println("Mart - Mayıs");

        if (ilkHarf == 'n' || ilkHarf == 'N')
            System.out.println("Nisan");

        if (ilkHarf == 'h' || ilkHarf == 'H')
            System.out.println("Haziran");

        if (ilkHarf == 't' || ilkHarf == 'T')
            System.out.println("Temmuz");

        if (ilkHarf == 'a' || ilkHarf == 'A')
            System.out.println("Ağustos - Aralık");

        if (ilkHarf == 'e' || ilkHarf == 'E')
            System.out.println("Eylül - Ekim");

        if (ilkHarf == 'k' || ilkHarf == 'K')
            System.out.println("Kasım");



    }
}
