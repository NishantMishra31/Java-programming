import java.util.Scanner;

public class sum_of_n_numbers {

    public static int sum_natural(int n) {

        // calculates sum of n numbers recursively
        if(n == 0) return 0;
        return n + sum_natural(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum_natural(n));
        sc.close();
    }
}
