package creational.builder;

import java.time.LocalDate;

public class Employee {

  private final String identification;
  private final String firstName;
  private final String lastName;
  private final String city;
  private final LocalDate birthDate;

  /**
   * Private constructor. Only allow to create objects using the builder.
   */
  private Employee(EmployeeBuilder builder) {
    this.identification = builder.identification;
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.city = builder.city;
    this.birthDate = builder.birthDate;
  }

  //SET methods were not created to provide immutability to the class

  public String getIdentification() {
    return identification;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getCity() {
    return city;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "identification='" + identification + '\'' +
        ", firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", city='" + city + '\'' +
        ", birthDate=" + birthDate +
        '}';
  }

  /**
   * Builder pattern implementation for {@link Employee} class.
   */
  public static class EmployeeBuilder {

    private String identification;
    private String firstName;
    private String lastName;
    private String city;
    private LocalDate birthDate;

    public EmployeeBuilder identification(String identification) {
      this.identification = identification;
      return this;
    }

    public EmployeeBuilder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public EmployeeBuilder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public EmployeeBuilder city(String city) {
      this.city = city;
      return this;
    }

    public EmployeeBuilder birthDate(LocalDate birthDate) {
      this.birthDate = birthDate;
      return this;
    }

    public Employee build() {
      return new Employee(this);
    }
  }
}