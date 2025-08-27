import java.util.Scanner;

public class power2 {

    public static double calcpower(int x, int n){
        if(n == 0) return 1; // base case
        double half = calcpower(x, n / 2); // recursive logn
        if(n % 2 == 0){ // if n is even
            return half * half; 
        }
        else{
            return half * half * x;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input class
        int x = sc.nextInt(); //input number
        int n = sc.nextInt(); // input power/exponent
        System.out.println(calcpower(x, n)); // call
        sc.close();
    }
}
