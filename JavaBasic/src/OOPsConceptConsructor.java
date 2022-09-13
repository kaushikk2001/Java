class Student{
    int age;
    String Name;
    int Rollno;
    public void info(){
        System.out.println(this.Rollno);
        System.out.println(this.Name);
        System.out.println(this.age);
    }
    //non parameterised consrtuctor
    Student(){
        System.out.println("Constructor is called");
    }
    //parameterised consructor
    Student(int age,String Name,int Rollno){
        this.Name=Name;
        this.age=age;
        this.Rollno=Rollno;
    }
    
}
public class OOPsConceptConsructor {
    public static void main(String[] args) {
        Student Kaushik=new Student();
        //Student() is consrtuctor the name of Constructor and  class name is always same
        //we dont need to call consrtuctor whenever we creat object consrtuctor is called itself
        //Consructor Does not return anything
        Kaushik.Rollno=69;
        Kaushik.Name="Kaushik";
        Kaushik.age=21;
        Kaushik.info();

        Student Ram=new Student(20,"Ram",21);   
        Ram.info();

    }
}
