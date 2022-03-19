package CompanyRoster;

public class Employee {
    // The name, salary, position and department
    // are mandatory while the rest are optional.
    private String name;
    private double salary;
    private String position;
    private String department;
    private String mail;
    private int age;

    public Employee(String name, double salary, String position, String department, String mail, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.mail = mail;
        this.age = age;
    }
    public Employee (String name, double salary, String position, String department, String mail){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.mail = mail;
        this.age = -1;
    }
    public Employee (String name, double salary, String position, String department){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.mail = "n/a";
        this.age = -1;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.mail = "n/a";
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        //Ivan 840.20 ivan@ivan.com -1
        return String.format("%s %.2f %s %d", name, salary, mail, age);
    }
}
