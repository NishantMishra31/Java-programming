import java.util.Scanner;

public class power {

    public static int calcpower(int x, int n){
        if(n == 0) return 1; // base case
        int pow = x * calcpower(x, n - 1); // recursive function
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input class
        int x = sc.nextInt(); //input number
        int n = sc.nextInt(); // input power/exponent
        System.out.println(calcpower(x, n)); // call
        sc.close();
    }
}
