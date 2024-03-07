public class Employee {
    private int empId;
    private String empName;
    private float empSal; // Changed data type to float for empSal
	
    public void setEmployee() {
        empId = 111;
        empName = "Rahul";
        empSal = 10000.89f;
    }
	
    public void displayEmployee() {
        System.out.println("Employee = [" + empId + " " + empName + " " + empSal + "]");
    }
	
    public static void main(String[] args) {
        Employee e = new Employee(); // Added parentheses to instantiate object
        // System.out.println(e.empId + " " + e.empName + " " + e.empSal);
        // Above line commented out because direct access to private members is not allowed
        e.setEmployee();
        e.displayEmployee();
    }
}
