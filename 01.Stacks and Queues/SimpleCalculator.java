import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split(" ");

        ArrayDeque <String> result = new ArrayDeque<>();

        Collections.addAll(result,array);

        while (result.size()>1){

            int firstNum = Integer.valueOf(result.pop());
            String sign = result.pop();
            int secondNum = Integer.valueOf(result.pop());

            if (sign.equals("-")){
                String currentResult =String.valueOf(firstNum-secondNum);
                result.push(currentResult);
            }else if (sign.equals("+")){
                String currentResult =String.valueOf(firstNum+secondNum);
                result.push(currentResult);
            }
        }
        System.out.println(result.pop());
    }
}
