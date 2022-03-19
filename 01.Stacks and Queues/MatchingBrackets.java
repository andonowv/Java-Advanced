import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();

        ArrayDeque <Integer> position = new ArrayDeque<>();
        char currentLetter = ' ';
        for (int i = 0; i < expression.length(); i++) {
            currentLetter = expression.charAt(i);
            if (currentLetter == '('){
                position.push(i);
            }else if (currentLetter == ')'){
                int begin = position.pop();
                System.out.println(expression.substring(begin, i+ 1));
            }

        }
    }
}
