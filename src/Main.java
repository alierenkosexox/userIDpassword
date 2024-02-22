import java.util.Scanner;

public class Main {                   //Kullanıcı Adı : patika      Şifre : java123
    public static void main(String[] args) {

        String userName, userPassword, passwordReset, newpassword , resetpassword=("");
        //kullanılacak bilgileri tanımlama
        Scanner input = new Scanner(System.in);
        //kullanıcı adı ve şifreyi isteyip kaydetme
        System.out.print("Kullanıcı Adını Girin : ");
        userName = input.nextLine();

        System.out.print("Şifrenizi Girin : ");
        userPassword = input.nextLine();
        // eğer kullanıcı adı ve şifre doğru ise sisteme giriş başarılı
        if (userName.equals("patika") && userPassword.equals("java123")) {

            System.out.println("\nBilgiler Doğru Giriş Yapılıyor..");

            //bilgiler yanlış ise hata infosu ve şifre sıfırlama sorusu sor
        } else {
            System.out.println("Giriş Yaptığınız Bilgiler Hatalı");
            System.out.println("Şifrenizi Sıfırlamak İster misinz ? (evet/hayır)");
            // şifre sıfırlama sorusunun cevabını kaydet ve yeni şifreyi input ile değiştir
            Scanner inputReset = new Scanner(System.in);
            passwordReset = inputReset.nextLine();
            // şifre sıfırlama talebinin durumuna göre şifre değişme case'lerine yönlendir
            switch (passwordReset) {
                case "evet":

                    // yeni şifreyi iste ve kaydet
                    System.out.println("Yeni Şifrenizi Belirleyiniz :");
                    Scanner changerinput = new Scanner(System.in);
                    newpassword = changerinput.nextLine();

                    //eski veya hatalı şifre harici girilen yeni şifeleri kabul et
                    if (newpassword.equals(resetpassword))
                    {
                        System.out.print("Şifreniz başarıyla değişti");
                    }
                    //eğer yeni şifre eski şifre ile aynı ise hata infosu yazdır
                    else if (newpassword.equals("java123")) {
                        System.out.println("Yeni şifreniz Eski şifreniz ile aynı olamaz");

                    //eğer yeni şifre girilen hatalı şifre ile aynı ise hata infosu yazdır
                    } else if (newpassword.equals(userPassword)) {
                        System.out.println("Yeni şifre Hatalı girdiğiniz şifre ile aynı olamaz.");
                }
                    break;      //case evet döngüsünü durdur

                case "hayır":   // şifre değiştirme talebi hayır ise red mesajı yazdır

                    System.out.println("Şifre değiştirmeyi onaylamadınız..");
                    break;

            }

        }


    }
}  // Ali Eren KÖSE 22/02/2024  03:48