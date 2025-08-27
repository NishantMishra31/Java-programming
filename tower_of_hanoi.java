import java.util.Scanner;

public class tower_of_hanoi {

    public static void tower(int n, String src, String helper, String dest) {
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        tower(n - 1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        tower(n - 1, helper, src, dest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tower(n, "A", "B", "C");
        sc.close();
    }
}
