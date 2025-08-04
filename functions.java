import java.util.Scanner;

public class functions {
    
    public static void printMyName(String firstName, String surName){
        System.out.println(firstName + " " + surName);
        return;
    }

    public static int addition(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        String surName = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        printMyName(firstName, surName);
        System.out.println(addition(a, b));
        System.out.println(multiply(a, b));
    }
}
