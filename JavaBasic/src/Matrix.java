import java.util.Scanner;
public class Matrix {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();//Take input of Row
        int C=sc.nextInt();//Take input of column
        int[][] A=new int[R][C];//Initialise array
        for (int i=0;i<R;i++){//Rows 
            for(int j=0;j<C;j++){//columns
                A[i][j]=sc.nextInt(); //input 
            }
        }
        System.out.println("Array is");
        //Printing array
        for (int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(A[i][j]+" ");;
            }
            System.out.println();
        }
    }
}

