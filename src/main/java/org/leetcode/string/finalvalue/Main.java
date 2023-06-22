package org.string.finalvalue;

public class Main {
    public int finalValueAfterOperations(String[] operations) {
        int ret = 0;
        for (String s: operations){
            if ("--X".equals(s) || "X--".equals(s)) ret --;
            else if("++X".equals(s) || "X++".equals(s)) ret ++;
        }
        return ret;
    }
}
