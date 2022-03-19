import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        ArrayDeque <Integer> numOut = new ArrayDeque<>();
        List <Integer> numOutList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String [] command = scanner.nextLine().split(" ");
            int operator = Integer.parseInt(command[0]);

            if (operator == 1){
                int numToPush = Integer.parseInt(command[1]);
                numOut.push(numToPush);
                numOutList.add(numToPush);
            }else if (operator == 2){
                numOut.poll();
                numOutList.remove(numOutList.size()-1);
            }else if (operator == 3){
                int maxNum = Integer.MIN_VALUE;
                for (int j = 0; j < numOutList.size(); j++) {
                    if (numOutList.get(j) > maxNum){
                        maxNum = numOutList.get(j);
                    }
                }
                System.out.println(maxNum);
            }
        }
    }
}
