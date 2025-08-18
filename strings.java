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
        System.out.println(fullName.length()); // length of the string

        // charAt
        for(int i = 0; i < fullName.length(); i++){
            System.out.print(fullName.charAt(i)); // index traversal
        }
        System.out.println();

        // compareTo
        if(firstName.compareTo(lastName) == 0){ // if(name1 == name2) can be ambiguous
            System.out.println("same entry both places");
        }
        else System.out.println("good entries");

        // substring
        String last3letters = fullName.substring(fullName.length() - 3); // begin index, last index(default length exclusive)
        System.out.println(last3letters);

        sc.close();
    }
}
