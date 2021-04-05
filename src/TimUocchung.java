import java.util.Scanner;

public class TimUocchung {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a =  Math.abs(s.nextInt());
        System.out.println("nhap b: ");
        int b =  Math.abs(s.nextInt());

        if(a==0 || b==0) System.out.println("khong co uoc chung lon nhat");
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        System.out.println("Uoc chung lon nhat: " + a);


    }
}
