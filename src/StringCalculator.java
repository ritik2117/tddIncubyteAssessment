public class StringCalculator {
    public static int add(String numbers) {
//        Check if the input string is empty or null
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }
//        Split the input string by commas and sum up the integers
        int sum = 0;
        String[] numberArray = numbers.split(",");
        for (String number : numberArray) {
            try {
                sum += Integer.parseInt(number);
            } catch (NumberFormatException e) {
                return sum;
            }
        }
        return sum;
    }
}
