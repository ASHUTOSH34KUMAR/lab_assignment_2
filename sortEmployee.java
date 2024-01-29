import java.util.*;

class employee {
    String Employee_ID;
    String Name;
    int Age;
    int Salary;

    public employee(String employee_id, String name, int age, int salary) {
        this.Employee_ID = employee_id;
        this.Name = name;
        this.Age = age;
        this.Salary = salary;
    }

    public String getEmployee_ID() {
        return Employee_ID;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getSalary() {
        return Salary;
    }

}

public class sortEmployee {
    public static void main(String[] args) {
        employee[] employees = {
                new employee("161E90", "Ramu", 35, 59000),
                new employee("171E22", "Tejas", 30, 82100),
                new employee("171G55", "Abhi", 25, 100000),
                new employee("152K46", "Jaya", 32, 85000)
        };

        Scanner input = new Scanner(System.in);
        System.out.println("choose a option to sort 1.Age 2.Name  3.Salary");
        int x = input.nextInt();

        switch (x) {
            case 1:
                Arrays.sort(employees, Comparator.comparingInt(employee::getAge));
                break;
            case 2:
                Arrays.sort(employees, Comparator.comparing(employee::getName));
                break;
            case 3:
                Arrays.sort(employees, Comparator.comparingInt(employee::getSalary));
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        System.out.println("Sorted Employee Data:");
        for (employee x1 : employees) {
            System.out.println("ID: " + x1.Employee_ID + ", Name: " + x1.Name +
                    ", Age: " + x1.Age + ", Salary: " + x1.Salary);
        }
    }

}
