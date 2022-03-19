import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map <Double,Integer> count = new LinkedHashMap<>();
        double [] nums = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(e-> Double.parseDouble(e)).toArray();

        for (int i = 0; i < nums.length; i++) {
            count.putIfAbsent(nums[i], 0);
            count.put(nums[i], count.get(nums[i])+1);
        }
        for (Map.Entry<Double,Integer> entry: count.entrySet()) {
            System.out.printf("%.1f -> %d\n", entry.getKey(), entry.getValue());
        }
    }
}
