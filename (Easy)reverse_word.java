import java.util.*;
class rev{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the String to reverse : ");
        String str = input.nextLine();
        String revs = "";
        int len = str.length();
        for(int i = len - 1; i >= 0;i--) {
            revs += str.charAt(i);
        }
         System.out.println("the reverse string : " + revs);
    }
}
