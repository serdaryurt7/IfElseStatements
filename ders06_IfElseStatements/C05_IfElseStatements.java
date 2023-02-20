package ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yaşınızı Giriniz: ");

        double girilenYas = scanner.nextDouble();

        if (girilenYas>=65)
            System.out.println("Yaşınız emekli olmak için yeterli.");
        else
            System.out.println("Çalışman gereken yıl: " + (65-girilenYas));
    }
}
