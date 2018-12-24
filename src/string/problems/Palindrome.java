package string.problems;
import java.util.Scanner;
public class Palindrome {
    public static boolean isPal(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        else if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPal(s.substring(1, s.length() - 1));
        }
        return false;
    }
    public static void main(String[] args) {
          /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String s = scan.nextLine();
        s = s.toLowerCase();
        if (isPal(s))
            System.out.println(s + " is a palindrome");
        else
            System.out.println(s + " is not a palindrome");
    }
}