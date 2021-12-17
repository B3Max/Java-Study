package work_11_12._4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Numbers {
    private final int countryCode;
    private final int firstThree;
    private final int secondThree;
    private final int four;

    private static final String INTERNATIONAL_REGEX = "^[+][0-9][/0-9]{0,15}$";
    private static final String RUSSIAN_REGEX = "^[8][/0-9]{10}$";


    private Numbers(int countryCode, int firstThree, int secondThree, int four) {
        this.countryCode = countryCode;
        this.firstThree = firstThree;
        this.secondThree = secondThree;
        this.four = four;
    }


    public String toUnique() {
        return new StringBuffer().append("+").append(countryCode).append(firstThree)
                .append("-").append(secondThree).append("-").append(four).toString();
    }


    public static Numbers fromInternational(String src) throws IllegalArgumentException {
        Matcher matcher = Pattern.compile(INTERNATIONAL_REGEX).matcher(src);
        if (!matcher.matches())
            throw new IllegalArgumentException("Wrong international phone number format.");

        return new Numbers(
                Integer.parseInt(src.substring(0, src.length()-10)),
                Integer.parseInt(src.substring(src.length()-10, src.length()-7)),
                Integer.parseInt(src.substring(src.length()-7, src.length()-4)),
                Integer.parseInt(src.substring(src.length()-4))
        );
    }


    public static Numbers fromRussian(String src) throws IllegalArgumentException {
        Matcher matcher = Pattern.compile(RUSSIAN_REGEX).matcher(src);
        if (!matcher.matches())
            throw new IllegalArgumentException("Wrong russian phone number format.");

        return new Numbers(
                7,
                Integer.parseInt(src.substring(1, 4)),
                Integer.parseInt(src.substring(4, 7)),
                Integer.parseInt(src.substring(7, 11))
        );
    }
}
