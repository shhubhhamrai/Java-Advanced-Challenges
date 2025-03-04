// Exercise 06: Created an abstract employee class and then implementing it to subclasses like manager and developer
// Abstract class Employee
abstract class Employee {
    protected String name;
    protected double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Abstract method to calculate salary
    public abstract void calculateSalary();

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Manager class extending Employee
class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateSalary() {
        System.out.println(name + "'s total salary as a Manager is: $" + salary);
    }
}

// Developer class extending Employee
class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateSalary() {
        System.out.println(name + "'s total salary as a Developer is: $" + salary);
    }
}

// Main class
public class Employeesalary {
    public static void main(String[] args) {
        // Creating Manager object
        Employee manager = new Manager("Alice", 80000);
        manager.calculateSalary();
        manager.displayInfo();

        System.out.println();

        // Creating Developer object
        Employee developer = new Developer("Bob", 60000);
        developer.calculateSalary();
        developer.displayInfo();
    }
}
