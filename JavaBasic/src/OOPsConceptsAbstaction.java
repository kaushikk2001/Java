class Vehicle{
    Vehicle(){
        System.out.println("We use to Travel");
    }
}
class twoWheeler extends Vehicle{
    twoWheeler(){
        System.out.println("I have two weels");   
    }
}
class car extends Vehicle{
    car(){
        System.out.println("I have four weels");
    }
}
public class OOPsConceptsAbstaction {
    public static void main(String[] args) {
        Vehicle Honda =new car();
        Vehicle Ktm =new twoWheeler();
    }
}
