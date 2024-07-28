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
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.nextLine();
        //System.out.println(n);
        String firstName[]=new String[n];
        String email[]=new String[n];
        String regExp="@gmail.com";
        ArrayList<String>sortedNames=new ArrayList<String>(n);
        for(int i=0;i<n;i++)
        {
            firstName[i]=sc.next();
            email[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            if(email[i].endsWith(regExp)==true)
            {
                sortedNames.add(firstName[i]);
            }
        }
        //System.out.println(al);
        Collections.sort(sortedNames);
        for(int i=0;i<sortedNames.size();i++)
        {
            System.out.println(sortedNames.get(i));
        }

    }
}

