package ders06_IfElseStatements;

public class C10_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanıcıdan cinsiyetini ve yaşını alın, Kadın, 60 yaş ve üzeri,
        //Erkek 65 yaş ve üzeri emekli olabilir.
        // Cinsiyet ve yaşını dikkate alarak
        // "Emekli Olabilirsin" veya "Emekli olmak için ... yıl daha çalışman gerekir" yazdırın.

        char cinsiyet = 'K';
        int yas = 60;

        if (cinsiyet == 'E' && yas>= 65 && yas>15)
            System.out.println("Emekli olabilirsin.");

        else if (cinsiyet == 'E' && yas<65)
            System.out.println("Emekli olmak için " + (65-yas) + " yıl daha çalışman gerekir.");

        else if (cinsiyet == 'K' && yas>=60)
            System.out.println("Emekli olabilirsin");

        else if (cinsiyet == 'K' && yas<60 && yas>15)
            System.out.println("Emekli olmak için " + (60-yas) + " yıl daha çalışman gerekir.");
        else
            System.out.println("Geçersiz Giriş.");
            

    }
}
