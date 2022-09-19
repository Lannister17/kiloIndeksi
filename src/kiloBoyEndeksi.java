import java.util.Scanner;

public class kiloBoyEndeksi {
    public static void main(String[] args) {
        float kilo,boy;
        double endeks;

        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        kilo = input.nextFloat();
        System.out.print("Boyunuzu (metre birimi ile) giriniz : ");
        boy = input.nextFloat();

        endeks = kilo / (boy * boy);
        System.out.println("Vicud Kitle İndeksiniz : "+endeks);
    }
}
