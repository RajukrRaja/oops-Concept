package OopsConcept;

public class AcessModifier {
    public static void main(String[] args) {
        BankAccount B1 = new BankAccount();
        B1.Username = "rajukumar ";
        // B1.password ="raju";
        System.out.println(B1.Username);
        B1.setPassword("raju");
        // System.out.println(B1.setPassword("East"));
    }
}

class BankAccount{
public String Username ;
private String password;

public void setPassword(String pwd){
    password = pwd;
}

}
