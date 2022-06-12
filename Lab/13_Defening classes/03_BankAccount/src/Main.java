import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Integer, BankAccount> bankAccountMap = new LinkedHashMap<>();
        while (!input.equals("End")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccountMap.putIfAbsent(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    break;

                case "Deposit":
                    int id = Integer.parseInt(commandLine[1]);
                    double amount = Double.parseDouble(commandLine[2]);
                    if (bankAccountMap.containsKey(id)) {
                        bankAccountMap.get(id).deposit(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                    } else System.out.println("Account does not exist");
                    break;

                case "SetInterest":
                    double setInterest = Double.parseDouble(commandLine[1]);
                    BankAccount.setInterestRate(setInterest);
                    break;

                case "GetInterest":
                    int idInterest = Integer.parseInt(commandLine[1]);
                    int years = Integer.parseInt(commandLine[2]);
                    if (bankAccountMap.containsKey(idInterest)) {
                        Double interest = bankAccountMap.get(idInterest).getInterest(years);
                        System.out.printf("%.2f%n", interest);
                    } else System.out.println("Account does not exist");

                    break;

            }


            input = scanner.nextLine();
        }

    }
}
//· Create
//
//· Deposit {Id} {Amount}
//
//· SetInterest {Interest}
//
//· GetInterest {ID} {Years}
//
//· End