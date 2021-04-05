import java.util.Scanner;
public class hienthi20SNT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap so nguyen a: ");
        long a = s.nextLong();
        int count = 0;
        boolean check = true;
        int dem = 0;
        if(a<2) count = 0;
        else {
            for (int i = 2; i < a ; i++) {
                if(a%i==0) count ++;
            }
        }
        if(count > 0) {
            check = false ;
        }
        else {
            check = true;
        }

        for (int i = 0; i < 100; i++) {
            if(check = true){
                dem++;
            }

        }
        System.out.println(dem);
        }


}