import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque <String> web = new ArrayDeque<>();

        String navigation = scanner.nextLine();
        String currentWeb = "";

        while (!navigation.equals("Home")){

            if (navigation.equals("back")){
                if (!web.isEmpty()){
                    currentWeb = web.pop();
                }else {
                    System.out.println("no previous URLs");
                    navigation = scanner.nextLine();
                    continue;
                }
            }else {
                if (!currentWeb.equals("")){
                    web.push(currentWeb);
                }
                currentWeb = navigation;
            }
            System.out.println(currentWeb);

            navigation = scanner.nextLine();
        }
    }
}