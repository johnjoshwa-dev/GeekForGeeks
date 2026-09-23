import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        // TypeCast to int double it and print
        int result=0;
        for(int i=0;i<num.length();i++){
        int digit=num.charAt(i);
        result=result*10+digit-48;
        }
        System.out.println(result*2);
    }
}