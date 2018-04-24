package pl.sda;

public class App {
    public static void main(String[] args) {
        EncoderNato encoder = new EncoderNato();
        System.out.println(encoder.encode("hello world"));

        DecoderNato decoder = new DecoderNato();
        System.out.println(decoder.decode("HOTEL ECHO LIMA LIMA OSCAR / WHISKEY OSCAR ROMEO LIMA DELTA"));

        //the same as above, but with static method
        System.out.println(NatoPhoneticAlphabetUtil.encodeMessage("hello world"));
        System.out.println(NatoPhoneticAlphabetUtil.decodeMessage("hotel echo lima lima oscar"));
    }
}
