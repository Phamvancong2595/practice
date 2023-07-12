package main.java.org.leetcode.string.interpret;

public class Main {
    public String interpret(String command) {
      StringBuilder sb = new StringBuilder();
      int count = 0;
      while (count < command.length()){
          if (command.charAt(count) == '(' && ')' == command.charAt(count + 1)){
              sb.append("o");
              count += 2;
          }else if (command.charAt(count) == '(' && ')' != command.charAt(count + 1)){
              sb.append("al");
              count += 4;
          }
          else if(command.charAt(count) == 'G') {
              sb.append("G");
              count ++;
          }
      }
        return sb.toString();
    }
}
