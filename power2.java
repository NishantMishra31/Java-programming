import java.util.Scanner;

public class power2 {

    public static int calcpower(int x, int n){
        if(n == 0) return 1; // base case
        if(n % 2 == 0){ 
            return calcpower(x, n / 2) * calcpower(x, n / 2); 
        }
        else{
            return calcpower(x, n / 2) * calcpower(x, n / 2) * x;
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
