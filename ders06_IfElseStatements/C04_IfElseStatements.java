package ders06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.

        // ASCII Table   A=65   between    Z=90
        // Bir karakterin büyük olması için büyük A ile büyük Z arasında olması lazım ASCII Tablosuna göre.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir Karakter Giriniz: ");

        char karakter = scanner.next().charAt(0);

        if (karakter >= 'A' && karakter <='Z')
            System.out.println("Büyük Harf");
        else
            System.out.println("Büyük Harf Değil");
    }
}
