
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] A =new int[5];//initialise array as int with length of array as 5
        float[] B=new float[5];//initialise array as float with length of array as 5
        String[] C=new String[5];//initialise array as String with length of array as 5
        //Take input of array
        for(int i=0;i<5;i++){//Size of Array // 
          A[i]=sc.nextInt();
        }
        sc.close();
        //printing Every element of array
        for(int i=0;i<5;i++){//Size of Array
            System.out.print(A[i] +" ");
        }
    
    }
}
