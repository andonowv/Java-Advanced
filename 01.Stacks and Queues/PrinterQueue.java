import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque <String> print = new ArrayDeque<>();

        String input = scanner.nextLine();
        String lastOper = null;
        while (!input.equals("print")){

            if (input.equals("cancel")){
                if (print.isEmpty()){
                    System.out.println("Printer is on standby");
                }else {
                    lastOper = print.poll();
                    System.out.printf("Canceled %s\n", lastOper);

                }
            }if (!input.equals("cancel")){
                print.offer(input);
            }

            input = scanner.nextLine();
        }
        for (String remain : print) {
            System.out.printf("%s\n", print.poll());
        }
    }
}
