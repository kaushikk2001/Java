public class BasicsStings {
    public static void main(String[] args) {
        String A="Kaushik";//Initialise String  
        System.out.println(A);
        //String length
        System.out.println(A.length());
        //Convert to lowercase\
        System.out.println(A.toLowerCase());
        //Convert to upper case
        System.out.println(A.toUpperCase());
        //Print Character at Specific location
        System.out.println(A.charAt(5));
        //print String Starting from Specific point And till Specific point
        System.out.println(A.substring(2,5));
        //Replace Character 
        System.out.println(A.replace('k','p'));
    }
}
