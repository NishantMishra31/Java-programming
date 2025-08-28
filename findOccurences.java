import java.util.Scanner;

public class findOccurences {

    public static int first = -1; // static declaration
    public static int last = -1; // static declaration

    public static void find(String str, int idx, char element) {
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == element){ // character matching
            if(first == -1){
                first = idx;
            }
            else last = idx;
        }
        find(str, idx + 1, element); // recursive call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char element = sc.next().charAt(0);
        find(str, 0, element);
        sc.close();
    }
}
