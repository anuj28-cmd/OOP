package OOP;
class Pen{
    String colour;
    String type;
    public void print_colour(){
        System.out.println("The pen is of "+this.colour);
    }
}

public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.colour = "Green";
        p1.type= "Gel" ;
        System.out.println(p1.colour +"\n"+"type="+p1.type);

    }
}

