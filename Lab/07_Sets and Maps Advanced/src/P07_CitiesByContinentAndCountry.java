import java.util.*;

public class P07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // Continent -> Countries -> City, City ......
        Map<String, Map<String, List<String>>> continentMap = new LinkedHashMap<>();

        while( n-- > 0){
            String[] input = scanner.nextLine().split(" ");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            continentMap.putIfAbsent(continent, new LinkedHashMap<>());
            continentMap.get(continent).putIfAbsent(country, new LinkedList<>());
            continentMap.get(continent).get(country).add(city);
        }

        //Europe:
        //  Bulgaria -> Sofia, Plovdiv
        //  Poland -> Warsaw, Poznan
        //  Germany -> Berlin

        continentMap.entrySet().forEach(continent -> {
            System.out.println(continent.getKey()+":");
            continent.getValue().entrySet().forEach(country -> {
                System.out.println("  " + country.getKey() + " -> "+
                        String.join(", ", country.getValue()));
            /*    System.out.printf("  %s -> ", country.getKey());
                System.out.println(country.getValue().stream().collect(Collectors.joining(", ")));*/
            });
        });
    }
}
