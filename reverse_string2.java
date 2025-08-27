import java.util.Scanner;

public class reverse_string2 {

    public static void reverse(String str, int idx) {
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str, idx - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        reverse(str, str.length() - 1);
        sc.close();
    }
}
