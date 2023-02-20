package ders06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.
        // kenar uzunlukları 0 veya negatif ise geçersiz kenar uzunluğu yazın.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üçgenin 3 kenarını sırası ile giriniz: ");
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();


        if (kenar1<=0 && kenar2<=0 && kenar3<=0)
        {
            System.out.println("Geçersiz Kenar Uzunluğu");
        }

        else if (kenar1 == kenar2 && kenar2 == kenar3)
        {
            System.out.println("Eşkenar Üçgen");
        }
        else
        {
            System.out.println("Eşkenar Üçgen Değil!");
        }
    }
}
