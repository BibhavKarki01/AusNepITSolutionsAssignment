package ausnepassignment.assignment3;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomAlphaNumericStringGenerator {
    private static final String ALPHA_NUMERIC_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
    private static final int STRING_LENGTH = 15;

    public static String generateRandomAlphaNumericString(){
        SecureRandom random = new SecureRandom();

        String randomString = random.ints(STRING_LENGTH, 0, ALPHA_NUMERIC_CHARS.length())
                .mapToObj(ALPHA_NUMERIC_CHARS::charAt)
                .map(Object::toString)
                .collect(Collectors.joining());

        return randomString;
    }
    public static void main(String[] args) {
        try {
            String randomString = generateRandomAlphaNumericString();
            System.out.println("Random Alpha-Numeric String: " + randomString);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
