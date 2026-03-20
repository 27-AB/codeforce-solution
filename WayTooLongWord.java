import java.util.Scanner;

public class WayTooLongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of words

        while (n-- > 0) {
            String word = sc.next();

            if (word.length() > 10) {
                // abbreviate
                System.out.println("" 
                    + word.charAt(0) 
                    + (word.length() - 2) 
                    + word.charAt(word.length() - 1));
            } else {
                // print as it is
                System.out.println(word);
            }
        }

        sc.close();
    }
}