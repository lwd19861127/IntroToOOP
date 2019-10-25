package polymorphism;

import java.util.Date;

// Abstract Class -
// - (when you have subclasses, and you don't need an instance of the superclass)
// - can not be instantiated.(cannot create an instance)
// - can have abstract methods
// - subclasses MUST implement all abstract methods.
public abstract class Employee {
    private String employeeId;
    private long salary;
    private Date startDate;

    public Employee(String employeeId, long salary, Date startDate) {
        this.employeeId = employeeId;
        this.salary = salary;
        this.startDate = startDate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public long getSalary() {
        return salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public abstract void work();
}
