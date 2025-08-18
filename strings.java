import java.util.Scanner;

// basic string declaration and implementation

public class strings {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        System.out.println("Your Name is: " + firstName + " " + lastName);
        sc.nextLine();  // to read buffer next line
        String sentence = sc.nextLine();
        System.out.println(sentence);
        sc.close();
    }
}
