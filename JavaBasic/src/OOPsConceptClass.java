class pen{
    String color;
    String type;
    public void write(){
        System.out.println("Hello");
    }    
    public void Printcolor(){
        System.out.println("Color of pen is "+this.color);
        //this ids keyword use as defining that this variable is called by this perticular object    
    }
    public void Printtype(){
        System.out.println("Type of pen is "+this.type);
    }
}
public class OOPsConceptClass{
    public static void main(String[] args) {
        pen Nataraj =new pen();// creating object of class pen
        Nataraj.color="Pink";
        Nataraj.type="Ink";
        Nataraj.write();
        Nataraj.Printcolor();
        Nataraj.Printtype();

        //creating Second object
        pen Pinpoint =new pen();// creating object of class pen
        Pinpoint.color="Black";
        Pinpoint.type="Gel";
        Pinpoint.write();
        Pinpoint.Printcolor();
        Pinpoint.Printtype();

    }
}
