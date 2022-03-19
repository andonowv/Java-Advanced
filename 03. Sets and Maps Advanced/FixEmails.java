import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <String, String> listMails = new LinkedHashMap<>();

        while (true){
            String name = scanner.nextLine();
            if (name.equals("stop")){
                break;
            }
            String mail = scanner.nextLine().toLowerCase(Locale.ROOT);

            String [] tokens = mail.split("\\.");
            String domain = tokens [1];

            if (domain.equals("us") || domain.equals("uk") || domain.equals("com")){
                continue;
            }else {
                listMails.put(name, mail);
            }

        }
        listMails.forEach((k,v) -> {
            System.out.printf("%s -> %s\n", k, v);
        });
    }
}
