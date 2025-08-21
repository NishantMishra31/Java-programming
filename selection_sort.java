import java.util.Scanner;

public class selection_sort {

    // this also takes O(N^2) TC 

    public static void selection(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            int mini = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[mini]) mini = j;
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        // call
        System.out.println();
        selection(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
