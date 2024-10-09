import java.util.*;
class rev{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
       
     System.out.print("enter user name : ");
     String us1 = input.nextLine();
     System.out.print("reenter user name : ");
     String us2 = input.nextLine();
     
     if(us1.equals(us2)) 
         System.out.println("given user name is valid");
     else 
         System.out.println("given user name is not valid");
     
     
    }
}
