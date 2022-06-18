package P02_CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
 //       List<Employee> employeeList = new LinkedList<>();
        Map<String, Department> departmentMap = new HashMap<>();

        while (n-- > 0) {
            String[] inputLine = scanner.nextLine().split(" ");

            String name = inputLine[0];
            double salary = Double.parseDouble(inputLine[1]);
            String position = inputLine[2];
            String department = inputLine[3];
            String email = "n/a";
            int age = -1;

         /*   if (inputLine.length == 6) {
                email = inputLine[4];
                age = Integer.parseInt(inputLine[5]);
            } else if (inputLine.length == 5) {
                if (inputLine[4].matches("\\d+")) {
                    age = Integer.parseInt(inputLine[4]);
                } else {
                    email = inputLine[4];
                }
            }*/

            Employee employee = null;


            switch (inputLine.length) {
                case 6:
                    email = inputLine[4];
                    age = Integer.parseInt(inputLine[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;
                case 5:
                    if (inputLine[4].matches("\\d+")) {
                        age = Integer.parseInt(inputLine[4]);
                        employee = new Employee(name, salary, position, department, age);
                    } else {
                        email = inputLine[4];
                        employee = new Employee(name, salary, position, department, email);
                    }
                    break;
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + inputLine.length);
            }

            departmentMap.putIfAbsent(department, new Department(department));
            departmentMap.get(department).getEmployees().add(employee);
            //     employeeList.add(employee);
        }
        //show variable type ctr+sht+p
        Department highestPaidDepartment = departmentMap.entrySet().stream().
                max(Comparator.comparing(e -> e.getValue().getAverageSalary()))
                .get()
                .getValue();

        //    System.out.printf(highestPaidDepartment.getName());

     //   highestPaidDepartment.getEmployees().stream()
      //                .sorted((e2, e1) -> Double.compare(e2.getSalary(), e1.getSalary()))
     //                         .forEach(System.out::println);

        System.out.println("Highest Average Salary: " + highestPaidDepartment.getName());
        highestPaidDepartment.getEmployees().sort(Comparator.comparing(Employee::getSalary).reversed());
        for (Employee employee : highestPaidDepartment.getEmployees()) {
            System.out.printf("%s %.2f %s %s%n",
                    employee.getName(), employee.getSalary(), employee.getEmail(),employee.getAge());
        }
    }
}
