import java.util.Scanner;

public class fibanacci {
    
    // to print the fibonacci sequence till n terms of input
    public static void printFib(int a, int b, int n){
        if(n == 0) return;
        int c = a + b;
        System.out.print(c);
        if(n > 1) System.out.print(", "); // to handle trailing comma
        printFib(b, c, n - 1);
    }
    public static void main(String[] args) {
        int a = 0, b = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1) System.out.println(a); //handles the edge for single term input
        else{
            System.out.print(a + ", " + b + ", "); // prints first two terms manually
            printFib(a, b, n - 2);
        }
        sc.close();
    }
}
