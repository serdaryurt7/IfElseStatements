package ders06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {

        //  Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir harf giriniz: ");

        char girilenHarf = scanner.next().charAt(0);

        if (girilenHarf>='a' && girilenHarf<='z'){

            System.out.println((char)(girilenHarf - 32));
        }

        else {

            System.out.println(girilenHarf);
        }
    }
}
