package P07_CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> customList = new CustomList<>();

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            String[] commandLine = input.split(" ");
            String command = commandLine[0];

            switch (command) {
                case "Add":
                    String stringToAdd = commandLine[1];
                    customList.add(stringToAdd);
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(commandLine[1]);
                    customList.remove(removeIndex);
                    break;
                case "Contains":
                    String elemToContains = commandLine[1];
                    System.out.println(customList.contains(elemToContains));
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(commandLine[1]);
                    int index2 = Integer.parseInt(commandLine[2]);
                    customList.swap(index1, index2);
                    break;
                case "Greater":
                    String elemToGreater =  commandLine[1];
                    System.out.println(customList.getCountOfGreater(elemToGreater));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    System.out.print(customList.toString());
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
//•	Add {element} - Adds the given element to the end of the list.
//•	Remove {index} - Removes the element at the given index.
//•	Contains {element} - Prints if the list contains the given element (true or false).
//•	Swap {index1} {index2} - Swaps the elements at the given indexes.
//•	Greater {element} - Counts the elements that are greater than the given element and prints their count
//•	Max - Prints the maximum element in the list.
//•	Min - Prints the minimum element in the list.
//•	Print - Prints all elements in the list, each on a separate line.
//•	END