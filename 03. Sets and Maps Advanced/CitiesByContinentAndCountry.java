import java.util.*;
import java.util.stream.Collectors;

public class CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> info = new LinkedHashMap<>();
        for (int i = 0; i < count; i++) {
            String [] tokens = scanner.nextLine().split(" ");
            String continent = tokens [0];
            String country = tokens [1];
            String city = tokens [2];

            info.putIfAbsent(continent, new LinkedHashMap<>());
            info.get(continent).putIfAbsent(country, new ArrayList<>());
            info.get(continent).get(country).add(city);
        }

        info.entrySet().forEach( entry -> {
            System.out.printf("%s:\n", entry.getKey());
            entry.getValue().forEach((country, city) -> {
                System.out.printf("%s -> %s\n", country,
                        city.stream().collect(Collectors.joining(", "))
                        );
            });
        });
    }
}
