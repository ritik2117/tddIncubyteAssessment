import java.util.regex.Pattern;

public class StringCalculator {
    public static int add(String numbers) {
//        Check if the input string is empty or null
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

//        Split the input string by commas and sum up the integers
        String delimiter = ",|\\\\n";
        if (numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 2);
        }
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
        int sum = 0;
        int flagNeg = 0;
        String[] numberArray = numbers.split(delimiter);
        StringBuilder negativeNumbers = new StringBuilder();
        for (String number : numberArray) {
            try {
                int num = Integer.parseInt(number);
                if (num < 0) {
                    flagNeg = 1;
                    if (negativeNumbers.length() > 0) {
                        negativeNumbers.append(", " + number);
                    } else {
                        negativeNumbers.append(number);
                    }
                }
                if (num > 0) {
                    sum += num;
                }
            } catch (NumberFormatException e) {
                return sum;
            }
        }
        if (flagNeg == 1) {
            throw new IllegalArgumentException("negative numbers not allowed " + negativeNumbers);
        }
        return sum;
    }
}
