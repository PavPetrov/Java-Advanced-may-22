import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        while (number-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            String brand = input[0];
            String model = input[1];
            int horsePower = Integer.parseInt(input[2]);
            Car car = new Car();

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);

            System.out.println(car.carInfo());

        }
    }
}
