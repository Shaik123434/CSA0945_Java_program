import java.util.*;
class rev{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
      System.out.print("enter the age : ");
      int ag = input.nextInt();
      if(ag >= 18) {
          System.out.println(" elegible for voting");
      }
      else if(ag < 0){
           System.out.println(" enter a valid number");
      }
      else {
           System.out.println(" need "+(18-ag)+" years to elegible for voting");
      }
    }
}
