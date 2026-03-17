import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = input.nextLine();

        HashSet<Character> set = new HashSet<>();
        for (char c : username.toCharArray()) {
            set.add(c);
        }

        if (set.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM");
        }

        input.close();
    }
}