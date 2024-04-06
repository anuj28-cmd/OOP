package OOP;
class Pen{
    String colour;
    String type;
    
    public void print_colour(String colour , String type){
        this.colour = colour;
        this.type = type;
        System.out.println("This is a "+this.colour +" pen of type "+this.type);
    }
        
    public void print_colour(){
        System.out.println("This is a "+this.colour +" pen of type "+this.type);
        
    }
    // the above method is an example of method overloading
}

public class Main {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.colour = "Green";
        p1.type= "Gel" ;
        p1.print_colour();
        System.out.println(" Colour = "+p1.colour +"\n"+" Type   = "+p1.type);
        p1.print_colour("Red","Ball");
        System.out.println(" Colour = "+p1.colour +"\n"+" Type   = "+p1.type);

    }
}

