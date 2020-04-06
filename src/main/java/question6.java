
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

 class Employee {
private int id;
   private String name;
   private String department;
   private double salary;
public Employee(int id, String name, String department, double salaray) {
   this.id = id;
   this.name = name;
   this.department = department;
   this.salary = salaray;
    }
}
public class question6 {
    private static Employee[] employees = {
     new Employee(1, "Ahmad", "IT", 1201),
     new Employee(2, "Sami", "Sales", 950.8),
     new Employee(5, "Huda", "IT",1010.5),
     new Employee(7, "Ali", "Marketing", 1300),
     new Employee(4, "Hani", "Sales", 1050)
    };
   List<Employee> listEmployees = Arrays.asList(employees);
  


}
