import java.util.Scanner;
public class hienthi20SNT {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Moi ban nhap so luong sont");
        int n = s.nextInt();
        printNPrimes(n);
    }
    public static boolean isPrime(int n){
        if (n<=1)
            return false;
        else
        if (n<=3)
            return true;
        else {
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
    public  static void printNPrimes(int n){
        int count = 0;
        int i = 2;
        while (count <n){
            if (isPrime(i)) {
                System.out.println(i);
                count++;}
            i++;
        }
    }
}