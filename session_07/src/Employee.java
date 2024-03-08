public class Employee {
    private String name;
    private String department;
    private double basic;

    
    public Employee(String name, String department, double basic) {
        this.name = name;
        this.department = department;
        this.basic = basic;
    }

    public double calculateNetSalary() {
        double hra = 0.32 * basic;
        double da = 0.45 * basic;
        double pf = 0.25 * basic;
        return basic + hra + da - pf;
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Bhakti", "IT", 50000);
        System.out.println("Net Salary:  " + emp.calculateNetSalary());
}

}
