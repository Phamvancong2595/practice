package main.java.org.leetcode.sort.quicksort;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{8,2,1,3,9,4,7,6,5};
        quickSort(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start , int end) {
        if (start >= end) return;
        int pivot = partition(arr,start,end);
        quickSort(arr,start,pivot - 1);
        quickSort(arr,pivot + 1,end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j ++){
            if (arr[j] <= pivot){
                i ++;
                swap(arr,i,j);
            }
        }
        i ++;
        swap(arr,i,end);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String superReducedString(String s) {
        // Write your code here
        Stack<Character> c = new Stack<>();
        for(char a: s.toCharArray()) {
            if(!c.isEmpty()) {
                if(c.peek() != a) {
                    c.add(a);
                } else {
                    c.pop();
                }
            } else {
                c.add(a);
            }
        }
        return "";
    }
}
