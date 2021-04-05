import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        int luachon = -1;
       Scanner s = new Scanner(System.in);

        while (luachon != 0) {
            System.out.println("Menu");
            System.out.println("1. ve tam giac");
            System.out.println("2. ve hinh vuong");
            System.out.println("3. ve hinh chu nhat");
            System.out.println("0. ket thuc");
            System.out.println("nhap lua chon: ");
            luachon = s.nextInt();

            if (luachon ==1) {
                    System.out.println("in hinh tam giac");

                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
            }
            if(luachon == 2){
                System.out.println("in hinh vuong");
                for(int j=1; j<5; j++){
                    System.out.println("* * * * *");
                }
            }
            if(luachon == 3){
                System.out.println("in hinh chu nhat");
                for(int j=1; j<5; j++){
                    System.out.println("* * * * * * *");
                }
            }
            if(luachon == 0){
                System.exit(0);
            }
            else {
                System.out.println("khong co lua chon phu hop.");
            }
        }
    }
}