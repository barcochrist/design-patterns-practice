package creational.builder;

import creational.builder.Employee.EmployeeBuilder;
import java.time.LocalDate;

public class MainBuilder {

  public static void main(String[] args) {
    Employee employee = new EmployeeBuilder()
        .identification("6171527121")
        .firstName("Fulanito")
        .lastName("Detal")
        .city("Medellin")
        .birthDate(LocalDate.of(1990, 10, 2))
        .build();
    System.out.println("Employee Builded: " + employee.toString());
  }
}