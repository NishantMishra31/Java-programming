import java.util.Scanner;

public class power {

    public static int calcpower(int x, int n){
        if(n == 0) return 1;
        int pow = x * calcpower(x, n - 1);
        return pow;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(calcpower(x, n));
        sc.close();
    }
}
