import java.util.Scanner;

public class circumference {

    // calculates circumference of a circle with radius r
    public static double printCircumference(int r){
        return 2 * 3.14 * r;  // pi taken constant
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(printCircumference(n));
    }
}
