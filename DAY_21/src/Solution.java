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

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        int noOfSwaps =0 ;
        // Write your code here
        for(int i=0; i<n-1; i++){
            boolean swapped=false;
            for(int j=0; j<n-1-i; j++){
                if(a.get(j)>a.get(j+1)){
                    swapped=true;
                    noOfSwaps++;
                    Collections.swap(a,j,j+1);
                }
            }
            if(swapped==false) break;
        }
        System.out.printf("Array is sorted in %d swaps.\n",noOfSwaps);
        System.out.printf("First Element: %d\n",a.get(0));
        System.out.printf("Last Element: %d",a.get(a.size()-1));
        bufferedReader.close();
    }
}

