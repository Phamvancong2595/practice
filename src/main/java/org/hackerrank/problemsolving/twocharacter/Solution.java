package main.java.org.hackerrank.problemsolving.twocharacter;

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

class Result {

    /*
     * Complete the 'alternate' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternate(String s) {
        // Write your code here
        Set<String> set = new HashSet<>(Arrays.asList(s.split("")));
        if(s.length() < 2) return s.length();
        for(String i: set) {
           String s1 = s.replaceAll(i,"");
        }
        return 0;
    }
    public static boolean isR(String s) {
        if (s.length() == 1) return true;
        for (int i = 0; i < s.length() -1; i ++) {
            if (s.charAt(i) == s.charAt(i + 1)) return false;
        }
        return true;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int result = Result.alternate(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

