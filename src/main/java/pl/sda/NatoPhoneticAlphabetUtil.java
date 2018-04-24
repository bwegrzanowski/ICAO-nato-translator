package pl.sda;

public class NatoPhoneticAlphabetUtil {
    public static String encodeMessage(String text) {
        EncoderNato encoder = new EncoderNato();
        String result = encoder.encode(text);
        return result;
    }

    public static String decodeMessage(String text) {
        DecoderNato decoder = new DecoderNato();
        String result = decoder.decode(text);
        return result;
    }
}
