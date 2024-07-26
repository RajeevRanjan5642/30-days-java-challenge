import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n;
        while(t!=0){
            n = sc.nextInt();
            boolean isPrime=true;
            for(int i=2; i*i<=n; i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime && n!=1) System.out.println("Prime");
            else System.out.println("Not prime");
            t--;
        }
    }
}

