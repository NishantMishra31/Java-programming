import java.util.Scanner;

// basic string declaration and implementation

public class strings {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String firstName = sc.next();
        String lastName = sc.next();
        String fullName = firstName + " " + lastName; // concatenation
        System.out.println(fullName);
        sc.nextLine();  // to read buffer next line
        String sentence = sc.nextLine();
        System.out.println(sentence);

        // length
        System.out.println(fullName.length());

        // charAt
        for(int i = 0; i < fullName.length(); i++){
            System.out.print(fullName.charAt(i));
        }
        System.out.println();

        // compareTo
        if(firstName.compareTo(lastName) == 0){
            System.out.println("same entry both places");
        }
        else System.out.println("good entries");

        // substring
        String first3letters = fullName.substring(0, 3);
        System.out.println(first3letters);
        
        sc.close();
    }
}
