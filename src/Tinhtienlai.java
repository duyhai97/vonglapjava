import java.util.Scanner;
public class Tinhtienlai {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap so tien cho vay: ");
        double money = s.nextDouble();
        System.out.println("so thang cho vay: ");
        int month = s.nextInt();
        System.out.println("nhap lai suat: ");
        double laisuat = s.nextDouble();
        double thuclai = 0;

        for (int i = 0; i < month; i++) {
            thuclai += money*(laisuat/100)/12*month;
        }

        System.out.println("tong lai la: " + thuclai);
    }
}
