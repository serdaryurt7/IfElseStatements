package ders06_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    public static void main(String[] args) {

        // kullanıcıdan bir tamsayı alın, sayı negatif ise "geçersiz sayı", tek basamaklı ise "rakam",
        // iki basamaklı ise "iki basamaklı sayı", bunun dışındaki sayılar için "Büyük Sayı" yazdırsın.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Tamsayı Giriniz: ");

        int sayi = scanner.nextInt();

        if (sayi<0)
            System.out.println("Geçersiz Sayı");

        else if (sayi < 10)
            System.out.println("Rakam");

        else if (sayi<100)
            System.out.println("İki Basamaklı Sayı");

        else
            System.out.println("Büyük Sayı");



    }
}
