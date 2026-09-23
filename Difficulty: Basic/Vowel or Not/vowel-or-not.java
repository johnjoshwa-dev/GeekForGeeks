import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        // code here
        if(Character.toLowerCase(ch)=='a'||Character.toLowerCase(ch)=='e'||Character.toLowerCase(ch)=='i'||Character.toLowerCase(ch)=='o'||Character.toLowerCase(ch)=='u') System.out.println("true"); else System.out.println("false");
    }
}