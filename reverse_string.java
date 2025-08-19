import java.util.Scanner;

public class reverse_string {

    // written swap function
    public static void swap(StringBuilder str, int i, int j) {
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        int l = 0, r = str.length() - 1;
        while(l < r){
            swap(str, l, r);
            l++;
            r--;
        }
        System.out.println(str);
        sc.close();
    }
}
