package main.java.org.leetcode.string.defangingipaddress;

public class Main {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < address.length(); i ++){
            if (address.charAt(i) != '.') sb.append(address.charAt(i));
            else {
                sb.append('[').append(address.charAt(i)).append(']');
            }
        }
        return sb.toString();
    }
}
