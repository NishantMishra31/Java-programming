import java.util.*;

class pattern1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        for(int i = 1; i <= x; i++){
            for(int j = 0; j < x; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
