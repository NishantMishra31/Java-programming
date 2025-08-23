import java.util.Scanner;

public class numberCount {

    public static void countNum(int n, Scanner sc){

        // count numbers' nature (positive, negative and zero)
        int posCount = 0, negCount = 0, zeroCount = 0;
        while(n > 0){
            int a = sc.nextInt();
            if(a > 0) posCount++;
            else if(a < 0) negCount++;
            if(a == 0) zeroCount++;
            n--;
        }
        System.out.println(posCount);
        System.out.println(negCount);
        System.out.println(zeroCount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        countNum(n, sc);
        sc.close();
    }
}
