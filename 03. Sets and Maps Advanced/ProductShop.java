import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map <String, Map<String, Double>> info = new TreeMap<>();
        while (!input.equals("Revision")){
            String [] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            info.putIfAbsent(shop, new LinkedHashMap<>());
            info.get(shop).putIfAbsent(product, price);
            input = scanner.nextLine();
        }

        info.entrySet().forEach( entry -> {
            System.out.printf("%s-> \n", entry.getKey());
            entry.getValue().forEach(  (product, price) -> {
                System.out.printf("Product: %s, Price: %.1f \n", product, price);
            });
        });
    }
}
