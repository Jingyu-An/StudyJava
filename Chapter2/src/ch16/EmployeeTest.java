package ch16;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("Lee");

        System.out.println(Employee.getSerialNum());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("Kim");

        System.out.println("Employee Id of " + employeeLee.getEmployeeName() + " is " + employeeLee.getEmployeeId());
        System.out.println("Employee Id of " + employeeKim.getEmployeeName() + " is " + employeeKim.getEmployeeId());
    }
}
