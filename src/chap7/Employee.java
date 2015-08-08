/*
 * This code is for the learning of Java
 * It is not, and is not intended to be, production grade code.   * 
 * Use at your own risk.  * 
 */
package chap7;

/**
 *
 * @author steve
 */
public class Employee extends Person {
    private Employee manager; 
    private int id;
    
    public Employee(String name, Employee manager, int empID) {
        super(name);
        this.setManager(manager);
        this.setEmployeeID(empID);        
    }
    public Employee getManager() {
        return manager;
    }

    private void setManager(Employee manager) {
        this.manager = manager;
    }

    private int getEmployeeID(int empID) {
        return id;
    }
    
    private void setEmployeeID(int employeeID) {
        this.id = employeeID;
    }
    public String displayName() {
        return "Employee: " + super.getName();
    }
    
    public static void runner() {
        Employee manager = new Employee("manager", null, 0);
        Employee employee = new Employee("employee", manager, 1);
        
        System.out.println(employee.getName());
        System.out.println("works for: " + employee.getManager().getName());
    }
}
