//Single inheritance We extend Shape to Triangle class there for it is single inheritance 
//Multiple inheritance in This we ented Already extended Class tringle to equilateral Triangle 
class Shape{
    public void Area(){
        System.out.println("Display Area");
    }

}
class Tringle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
class equilateralTriangle extends Tringle{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
public class OOPsConceptInheritance {
    public static void main(String[] args) {

    }
}
