package pl.sda;

import java.util.HashMap;
import java.util.Map;

public class EncoderNato {
    public String encode(String textToEncode) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("A", "ALPHA");
        dictionary.put("B", "BRAVO");
        dictionary.put("C", "CHARLIE");
        dictionary.put("D", "DELTA");
        dictionary.put("E", "ECHO");
        dictionary.put("F", "FOXTROT");
        dictionary.put("G", "GOLF");
        dictionary.put("H", "HOTEL");
        dictionary.put("I", "INDIA");
        dictionary.put("J", "JULIETT");
        dictionary.put("K", "KILO");
        dictionary.put("L", "LIMA");
        dictionary.put("M", "MIKE");
        dictionary.put("N", "NOVEMBER");
        dictionary.put("O", "OSCAR");
        dictionary.put("P", "PAPA");
        dictionary.put("Q", "QUEBEC");
        dictionary.put("R", "ROMEO");
        dictionary.put("S", "SIERRA");
        dictionary.put("T", "TANGO");
        dictionary.put("U", "UNIFORM");
        dictionary.put("V", "VICTOR");
        dictionary.put("W", "WHISKEY");
        dictionary.put("X", "XRAY");
        dictionary.put("Y", "YANKEE");
        dictionary.put("Z", "ZULU");
        dictionary.put(" ", "/");

        StringBuilder resultBuilder = new StringBuilder();

        for (String s : textToEncode.toUpperCase().split("")) {
            resultBuilder.append(dictionary.get(s)).append(" ");
        }

        return resultBuilder.toString().trim();
    }
}
