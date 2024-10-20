package OopsConcept;

public class GetterSetters {
    
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setColor("blue ");
    }
}

class pen{
    String color;
    int tip;

    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void seTip(int tip){
        this.tip = tip;
    }
}

