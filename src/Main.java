import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        /**
         * Unit Test Cases:
         * 1. Input: "", "1", "1,5"
         * Output: 0, 1, 6
         *
         * 2. Input: 1\n2,3
         * Output: 6
         *
         * 3. Input: //;\n1;2
         * Output: 3
         */
        System.out.print("Enter numbers\n");
        String number = scanner.nextLine();
        sb.append(number);
        String input = sb.toString();
        System.out.println("Input: " + input);
        System.out.println("Output: " + StringCalculator.add(number));
        return;
    }
}