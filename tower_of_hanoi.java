import java.util.Scanner;

public class tower_of_hanoi {

    // classic tower of hanoi problem with 3 disks and n input number of disks
    public static void tower(int n, String src, String helper, String dest) {
        if(n == 1){ // base case
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        tower(n - 1, src, dest, helper); // passing different values for src, helper and dest towers
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        tower(n - 1, helper, src, dest); // passing different values for src, helper and dest towers
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input number of disks
        tower(n, "A", "B", "C"); // call with tower names
        sc.close();
    }
}
