import java.util.Scanner;

public class OOPS{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String : ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second String : ");
        String s2 = sc.nextLine();
        int len1 = s1.length();
        int len2 = s2.length();

        System.out.println("The length of the first string is " +s1.length());
        System.out.println("The length of the second string is " +s2.length());
        if(len1 != len2){
            System.out.println("The length of the two strings is not the same");
        }
        else{
            System.out.println("The length of the two strings is the same");
        }
        if(s1.equals(s2)){
            System.out.println("The two string is equal");
        }
        else{
            System.out.println("The two string is not equal");
        }
    }
}