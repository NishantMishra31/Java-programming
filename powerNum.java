import java.util.Scanner;

public class powerNum {

    public static long exponential(int x, int n){
        long result = 1;
        while(n > 0){
            result = result * x;
            n--;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        System.out.println(exponential(x, n));
    }
}
