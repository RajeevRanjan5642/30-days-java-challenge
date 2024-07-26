import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        // date the book was actually returned
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();

        // date the book was expected to be returned
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();

        if(y1==y2){
            if(m1==m2){
                if(d1<=d2) System.out.println("0");
                else System.out.println(15*(d1-d2));
            }
            else if(m1<m2) System.out.println("0");
            else System.out.println(500*(m1-m2));
        }
        else if(y1<y2) System.out.println("0");
        else System.out.println("10000");
    }
}

