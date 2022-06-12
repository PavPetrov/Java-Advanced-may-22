import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        while (number-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            String brand = input[0];

            Car car;

            if (input.length == 1) {
                car = new Car(brand);
            } else {
                String model = input[1];
                int horsePower = Integer.parseInt(input[2]);
                car = new Car(brand, model, horsePower);
            }

            System.out.println(car.carInfo());

        }
    }
}

