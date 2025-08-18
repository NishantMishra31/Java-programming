import java.util.Scanner;

// basic array implementation and searching

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.println(num[i]);
        }
        int x = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(num[i] == x) System.out.println("index: " + i);
        }
        sc.close();
    }
}
