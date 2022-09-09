import java.util.Scanner;

public class MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of A Array ");
        int LengthA=sc.nextInt();
        System.out.println("Enter length of B Array ");
        int LengthB=sc.nextInt();
        System.out.println("Enter First Array");
        int[] A=new int[LengthA];
        for(int i=0;i<LengthA;i++){
            A[i]=sc.nextInt();
        }
        int[] B=new int[LengthA];
        System.out.println("Enter Second Array");
        for(int i=0;i<LengthB;i++){
            B[i]=sc.nextInt();
        }
        int LengthC=LengthA+LengthB;
        int[] C=new int[LengthC];
        System.arraycopy(A, 0, C, 0, LengthA);
        //Start Coping from position 0 and Append on the position of c Starting from 0
        //Bracket (SourceArray,positionTostartCoping,Whereyocopy,positionTostartpesting,Lengthtillwhere tocopy)
        System.arraycopy(B, 0, C, LengthA, LengthB);
        //Start Coping from position 0 and Append on the position of c Starting from value of length of A
        for(int i=0;i<LengthC;i++){
             System.out.print(C[i]+" ");
        }

    }
}
