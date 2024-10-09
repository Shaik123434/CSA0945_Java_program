import java.util.*;
class rev{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
      System.out.print("enter the number : ");
      int n = input.nextInt();
      int r = 0;
      int s = String.valueOf(n).length();
      int re = 0;
      for(int i = 0; i < s; i++){
          re = n % 10;
          r = (r*10)+re;
          n /= 10;
      } 
    
       System.out.print("the reverse number is : " + r);
    }
}
