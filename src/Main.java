import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.print("Enter numbers\n");
        String number = scanner.nextLine();
        sb.append(number);
        String input = sb.toString();
        System.out.println("Input: " + input);
        System.out.println("Output: " + StringCalculator.add(number));
        return;
    }
}