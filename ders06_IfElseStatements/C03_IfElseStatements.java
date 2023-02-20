package ders06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin 3 kenarını sırası ile giriniz: ");

        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        if (kenar1 == kenar2 && kenar2 == kenar3)
            System.out.println("Eşkenar Üçgen");
        else
            System.out.println("Eşkenar Üçgen Değil!");


    }
}
