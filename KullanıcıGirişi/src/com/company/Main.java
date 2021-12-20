package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
   yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,şifreler aynı ise
   ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

 */

        String usserName, password, secim, newPassword;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        usserName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();
        if (usserName.equals("dilan") && password.equals("java123")) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Giriş yapılamadı.Hatalı şifre girdiniz.Şifrenizi sıfırlamak ister misiniz?");
            Scanner inp = new Scanner(System.in);
            secim = inp.nextLine();
            if (secim.equals("evet")) {
                Scanner inp2 = new Scanner(System.in);
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword = inp2.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı.Lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }else{
                System.out.println("Çıkışınız gerçekleştiriliyor.");
            }



        }
    }
}
