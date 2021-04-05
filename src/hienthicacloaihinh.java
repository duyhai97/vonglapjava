import java.util.Scanner;
public class hienthicacloaihinh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("hinh tam giac");
        for (int i = 1; i < 7; i++) {
            for(int j =0; j < i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

        System.out.println("tam giac vuong");

        for(int i=7;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
    }
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5-i; j++) {
                System.out.print("  ");
            }
            for(int k = 1; k <= 2*i-1; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


        System.out.println("hinh chu nhat");
        for (int i = 1; i <5 ; i++) {
            System.out.println("* * * * *");
        }


    }
}
