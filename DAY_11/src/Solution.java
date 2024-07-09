import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int max=0;
        int currMax=0;
        while(n!=0){
            if((n&1)==1) currMax+=1;
            else{
                max=Math.max(max,currMax);
                currMax=0;
            }
            n>>=1;
        }
        max=Math.max(max,currMax);
        System.out.println(max);
        bufferedReader.close();
    }
}

