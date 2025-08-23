public class fact_recursion {
    
    // calculate factorial of a number using recursion
    public static int facto(int n) {
        if (n == 0 || n == 1) return 1;
        return n * facto(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(facto(5));
    }
}
