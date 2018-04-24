package pl.sda;

import java.util.HashMap;
import java.util.Map;

public class DecoderNato {
    public String decode(String textToDecode) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("ALPHA", "A");
        dictionary.put("BRAVO", "B");
        dictionary.put("CHARLIE", "C");
        dictionary.put("DELTA", "D");
        dictionary.put("ECHO", "E");
        dictionary.put("FOXTROT", "F");
        dictionary.put("GOLF", "G");
        dictionary.put("HOTEL", "H");
        dictionary.put("INDIA", "I");
        dictionary.put("JULIETT", "J");
        dictionary.put("KILO", "K");
        dictionary.put("LIMA", "L");
        dictionary.put("MIKE", "M");
        dictionary.put("NOVEMBER", "N");
        dictionary.put("OSCAR", "O");
        dictionary.put("PAPA", "P");
        dictionary.put("QUEBEC", "Q");
        dictionary.put("ROMEO", "R");
        dictionary.put("SIERRA", "S");
        dictionary.put("TANGO", "T");
        dictionary.put("UNIFORM", "U");
        dictionary.put("VICTOR", "V");
        dictionary.put("WHISKEY", "W");
        dictionary.put("XRAY", "X");
        dictionary.put("YANKEE", "Y");
        dictionary.put("ZULU", "Z");
        dictionary.put("/", " ");
        String[] letters = textToDecode.toUpperCase().split(" ");

        StringBuffer result = new StringBuffer();
        for (String letter : letters) {
            result.append(dictionary.get(letter));
        }
        return result.toString();
    }
}
