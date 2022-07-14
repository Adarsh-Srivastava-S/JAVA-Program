
import java.util.Scanner;
public class demoMethods3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The User Name-:");
        String uName=s.nextLine();
        System.out.println("Enter the password -:");
        String pWord=s.nextLine();
        System.out.println("Enter the First Name -:");
        String fName=s.nextLine();
        System.out.println("Enter Your Phone Number-: ");
        long phNo=Long.parseLong(s.nextLine());
        // long phNo=s.nextLong();
        
        System.out.println("Enter The email Id-:");
        // s.nextLine();
        String eId=s.nextLine();
        System.out.println("============Usre Details==========");
        System.out.println("The User Name ="+uName);
        System.out.println("The Password Name ="+pWord);
        System.out.println("The First Name ="+fName);
        System.out.println("The Phone Number ="+phNo);
        System.out.println("The User Name ="+eId);
       
        s.close();
    }
}
