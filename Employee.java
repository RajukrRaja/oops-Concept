public class Employee {
    private int exp;
    
    public int getExp() {
        return exp;
    }
    
    public void setExp(int exp) {
        this.exp = exp;
    }
    
    public double calculateSalary() {
        return exp * 5000; // Salary calculation based on experience
    }
}

class PermEmployee extends Employee {
    
    public void doFun() {
        System.out.println("having fun");
    }
    
    public static void main(String[] args) {
        PermEmployee p1 = new PermEmployee(); // Create an instance of PermEmployee
        p1.doFun(); // Call the doFun method
        
        p1.setExp(5); // Set experience
        double salary = p1.calculateSalary(); // Calculate salary
        System.out.println("Salary: " + salary); // Print the salary
    }
}
