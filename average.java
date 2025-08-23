import java.util.Scanner;

public class average {

    // to print average of three numbers
    public static int averageNumbers(int a, int b, int c){
        int avg = (a + b + c) / 3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println(averageNumbers(a, b, c));
    }
}
