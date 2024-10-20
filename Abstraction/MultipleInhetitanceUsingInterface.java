package OopsConcept.Abstraction;

public class MultipleInhetitanceUsingInterface {
    public static void main(String[] args) {
        son s = new son();
        s.Hardworking();
        s.management();
    }
}

interface father{
void management();
}

interface Mother{
void Hardworking();
}


class son implements father , Mother{

  public  void management(){
        System.out.println("it manage well");
    }

    public void Hardworking(){
        System.out.println("Harwoking Gems");
    }


}