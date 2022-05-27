import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String id,pw,pw2,a;
        System.out.print("ID giriniz : ");
        id = input.nextLine();
        System.out.print("Password giriniz : ");
        pw = input.nextLine();

        if (id.equals("java") && pw.equals("patika123")) {
            System.out.println("Giriş yaptınız.");
        }else if(id.equals("java") && (!pw.equals("patika123"))){
            System.out.print("Şifrenizi değiştirmek istiyor musunuz ? \n1-evet / 2-hayır : ");
            a = input.nextLine();
            System.out.println("A değeri = " + a);
            if (a.equals("evet")) {
                System.out.print("Yeni şifre giriniz : ");
                pw2 = input.nextLine();
                if (pw2.equals(pw)  || pw2.equals("patika123")) {
                    System.out.println("Şifre oluşturulamadı. Lütfen yeni şifre giriniz");
                }else {
                    System.out.println("Yeni şifre oluşturuldu");
                }
            }else{
                System.out.println("Şifrenizi tekrar giriniz.");
            }
        }else{
            System.out.println("Bilgileriniz yanlış");
        }
    }
}
