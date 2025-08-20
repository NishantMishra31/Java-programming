import java.util.Scanner;

public class insertion_sort {
    
    // this takes O(N^2) TC
    
    public static void insertion(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " " );
        }
        // call
        System.out.println();
        insertion(arr);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
