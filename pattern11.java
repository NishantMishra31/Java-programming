import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {

        // solid rhombus
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <=n; i++){
            int spaces = n - i;
            for(int j = 1; j <= spaces; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
