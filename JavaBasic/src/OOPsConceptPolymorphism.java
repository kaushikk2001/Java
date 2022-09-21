import java.util.jar.Attributes.Name;

class bike{
    String name;
    int Capacity;
    int price;
    public void info(String name,int Capacity){
        System.out.println(this.name);
        System.out.println(this.Capacity);

        // System.out.println(this.price);
    }
    public void info(String name){
        System.out.println(this.name);
    }
    public void info(int Capacity){
        System.out.println(this.Capacity);
    }
    //The word polymorphism means having many forms. In simple words, 
    //we can define polymorphism as the ability of a message to be displayed in more than one form. 
    
}
public class OOPsConceptPolymorphism {
    public static void main(String[] args) {
        bike Ducati=new bike();
        Ducati.name="Panigalepsv4";
        Ducati.Capacity=2000;
        Ducati.info(Ducati.name);
        Ducati.info(Ducati.Capacity);
        Ducati.info(Ducati.name, Ducati.Capacity);
    }
}
