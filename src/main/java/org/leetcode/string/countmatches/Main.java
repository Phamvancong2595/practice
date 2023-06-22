package org.string.countmatches;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
//        int res = 0;
//        List<Element> l = new ArrayList<>();
//            for (List<String> s: items){
//               Element e = new Element(s.get(0),s.get(1),s.get(2));
//               l.add(e);
//            }
//                if (Element.COLOR.equals(ruleKey)){
//                    res = (int) l.stream().filter(t -> t.getColor().equals(ruleValue)).count();
//                }else if(Element.TYPE.equals(ruleKey)){
//                    res = (int) l.stream().filter(t -> t.getType().equals(ruleValue)).count();
//                } else if(Element.NAME.equals(ruleKey)){
//                    res = (int) l.stream().filter(t -> t.getName().equals(ruleValue)).count();
//                }
//                return res;
//    }
        int res = 0;
        int ind = 0;
        if (ruleKey.equals("type")) {
        }
        else if (ruleKey.equals("color")) ind = 1;
        else if (ruleKey.equals("name")) ind = 2;
        for (List<String> l : items) {
            if (l.get(ind).equals(ruleValue)) res++;
        }
        return res;
    }
}