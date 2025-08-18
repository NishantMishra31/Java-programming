public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Nishant");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        // set char at index
        sb.setCharAt(0, 'M');
        System.out.println(sb);

        // insert at index
        sb.insert(5, 'a');
        System.out.println(sb);
    }
}
