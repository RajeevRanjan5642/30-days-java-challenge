import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HashMap<String,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String name,phone;
        while(n!=0){
            name=sc.next();
            phone=sc.next();
            map.put(name,phone);
            n--;
        }
        sc.nextLine();
        String query;
        while(sc.hasNextLine()){
            query=sc.nextLine();
            if(map.get(query)!=null) System.out.println(query+"="+map.get(query));
            else System.out.println("Not found");
        }
    }
}