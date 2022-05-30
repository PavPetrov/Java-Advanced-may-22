import java.util.*;

public class P06_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //    Shops   Product    Price
        Map<String, Map<String, Double>> shops = new TreeMap<>();
        while (!input.equals("Revision")) {
            String[] data = input.split(", ");
            String shop = data[0];
            String product = data[1];
            Double price = Double.parseDouble(data[2]);

            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).putIfAbsent(product, price);

            input = scanner.nextLine();
        }

        System.out.println();

        //"{shop}->
        //Product: {product}, Price: {price}"

        for (var entry : shops.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (var products : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f%n", products.getKey(), products.getValue());
            }
        }
    }
}
