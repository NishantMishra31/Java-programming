import java.util.Scanner;

public class pattern12 {
    public static void main(String[] args) {

        // number pyramid 

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n; i++){
            int spaces = n - i;
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
