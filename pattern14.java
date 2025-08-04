import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {

        // diamond pattern

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n; i++){
            int spaces = n - i;
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            int stars = 2 * i - 1;
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--){
            int spaces = n - i;
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            int stars = 2 * i - 1;
            for(int j = 1; j <= stars; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
