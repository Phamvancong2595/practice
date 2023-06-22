package org.string.rearrangespace;

public class Main {
    public String reorderSpaces(String text) {
        StringBuilder sb = new StringBuilder();
        String[] ret = getArrStr(text);
        int numOfSpace = text.replaceAll("[^ ]","").length();
        if (ret.length < 2) {
            return sb.append(text.replaceAll("^\\s+|\\s+$", "")).append(" ".repeat(numOfSpace)).toString();
        }
        return joinStringAndSpace(sb, ret, numOfSpace);
    }

    private String joinStringAndSpace(StringBuilder sb, String[] ret, int numOfSpace) {
        String mSpace = " ".repeat(numOfSpace /(ret.length -1));
        String eSpace = " ".repeat(numOfSpace %(ret.length -1));
        for(int i = 0; i < ret.length -1; i ++){
            sb.append(ret[i]).append(mSpace);
        }
        sb.append(ret[ret.length -1]);
        return sb.append(eSpace).toString();
    }

    private String[] getArrStr(String text) {
        String r = text.replaceAll("^\\s+|\\s+$", "");
        return r.split("\\s+");
    }
}
