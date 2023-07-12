package main.java.org.hackerrank.problemsolving.panrams;

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
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
        String s1 = s.replaceAll(" ","");
        // Write your code here
        String a = s1.toLowerCase();
        int[] arr = new int[26];
        for(char i: a.toCharArray()) {
            arr[i - 97] ++;
        }
        for(int i: arr) {
            if(i == 0) return "not pangram";
        }
        return "pangram";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        System.out.println(Result.pangrams("We promptly judged antique ivory buckles for the next prize"));
    }
}

