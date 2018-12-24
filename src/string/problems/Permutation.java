package string.problems;
import java.util.Scanner;
public class Permutation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String a to check permutation:");
        String a = scan.nextLine();
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        wPermutation("", a);
    }
    public static void wPermutation(String pfx, String w){
        int length = w.length();

        if(length==0){
            System.out.println(pfx);
        }else{
            for(int i=0; i < length; i++){
                wPermutation(pfx + w.charAt(i), w.substring(0, i) + w.substring(i+1,length));
            }
        }
    }
}