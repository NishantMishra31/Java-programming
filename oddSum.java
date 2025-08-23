import java.util.Scanner;

public class oddSum {
    public static int printSum(int n){

        // prints sum of first n odd numbers
        int sum = 0;
        while(n > 0){
            if(n % 2 == 1) sum += n;
            n--;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(printSum(n));
    }
}
