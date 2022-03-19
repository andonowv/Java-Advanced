package CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List <Employee> employeeList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String [] tokens = scanner.nextLine().split("\\s+");
            String name = tokens [0];
            Double salary = Double.parseDouble(tokens [1]);
            String position = tokens[2];
            String department = tokens [3];
            if (tokens.length == 4){
                Employee particularEmployee = new Employee(name, salary, position, department);
                employeeList.add(particularEmployee);
            }
            if (tokens.length == 5){
                if (Character.isDigit(tokens[4].charAt(0))){
                    int age = Integer.parseInt(tokens[4]);
                    Employee particularEmployee = new Employee(name, salary, position, department, age);
                    employeeList.add(particularEmployee);
                } else {
                    String mail = tokens [4];
                    Employee particularEmployee = new Employee(name, salary, position, department, mail);
                    employeeList.add(particularEmployee);
                }
            }
            if (tokens.length == 6){
                String mail = tokens [4];
                int age = Integer.parseInt(tokens[5]);
                Employee particularEmployee = new Employee(name, salary, position, department, mail, age);
                employeeList.add(particularEmployee);
            }
        }
        String department = null;
        employeeList.sort(Comparator.comparing(e -> e.getSalary()));
        for (Employee employee : employeeList) {
            department = employee.getDepartment();
        }
        String output = "Highest Average Salary: " + department;
        System.out.println(output);
        Collections.reverse(employeeList);
        for (Employee employee : employeeList) {
            if (employee.getDepartment().equals(department)){
                System.out.println(employee);
            }
        }
    }
}
