import java.util.Scanner;

public class pattern8 {
    public static void main(String args[]){

        // number ascending right triangle

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int k = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
