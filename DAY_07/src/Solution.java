import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t;
        t=sc.nextInt();
        sc.nextLine();
        while(t!=0){
            String str;
            str=sc.nextLine();
            String even="";
            String odd="";
            for(int i=0; i<str.length(); i++){
                if(i%2==0) even+=str.charAt(i);
                else odd+=str.charAt(i);
            }
            System.out.println(even+" "+odd);
            t--;
        }
    }
}
