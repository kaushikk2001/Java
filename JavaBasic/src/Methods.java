public class Methods {
    //Void is use to Give output of method in Print format
    static void Print(){
        System.out.println("Hello");
    }
    //int will not print anything it will return the value 
    //int n is use to get initial value from "main"
    //same for Double and float   
    static int Double(int n){
        return n*2;
    }
    //in this method two different type of input are given
    static void info(String Name,int age){
        System.out.println("My name is "+Name +" And Age is" +age);
    }
    public static void main(String[] args) {
        Print();
        Double(5);
        info("Kaushik", 21);
    }
    
}
