package designpattern.behavior.interpreter;

import java.util.HashMap;
import java.util.Map;

public class EnToViTranslator implements Translator{
    private final Map<String, String> dictionary = loadDictionary();
    @Override
    public String translate(String input) {
        return dictionary.getOrDefault(input, input);
    }
    private Map<String, String> loadDictionary() {
        final Map<String, String> example = new HashMap<>();
        example.put("hello", "Xin Chao");
        example.put("world", "The Gioi");
        return example;
    }
}
