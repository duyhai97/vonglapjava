import java.util.Scanner;

public class hienthiSNTnhohon100 {
    public static void main(String[] args) {
        hienthiSNTnhoohon100();
    }

    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n <= 3)
            return true;
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }

    public static void hienthiSNTnhoohon100(){
        for (int i = 0; i < 100; i++) {
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
