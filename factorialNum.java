import java.util.Scanner;

public class factorialNum {
    public static long factorial(int a){
        if (a < 0) return -1;
        if (a == 0) return 1;
        long fact = 1;
        while(a > 1){
            fact = fact * a;
            a--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println(factorial(a));
    }
}
