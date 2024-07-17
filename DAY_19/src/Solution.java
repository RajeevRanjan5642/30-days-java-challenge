import java.io.*;
import java.util.*;

public class Solution {
    // Write your code here.
    private List<Character>stack;
    private List<Character>queue;
    Solution(){
        stack = new ArrayList<>();
        queue = new ArrayList<>();
    }
    public void pushCharacter(char ch){
        stack.add(ch);
    }

    public char popCharacter(){
        char ch = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return ch;
    }

    public void enqueueCharacter(char ch){
        queue.add(ch);
    }

    public char dequeueCharacter(){
        char ch = queue.get(0);
        queue.remove(0);
        return ch;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
