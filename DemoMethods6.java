
import java.util.Scanner;


class StudentResult
{
    String Calculate(float per)
    {
        String q;
        if(per>=70)
        {
             q="Distinctiom";
            
        }
        else if(per>=60)
        {
            q="First Class";
           
        }
        else if(per>=50)
        {
            q="Second Class";
        }
        else if(per>=35)
        {
            q="third Class";
        }
       else 
       {
        q="Fail";
       }
        return q;
    }
}
public class DemoMethods4
{
   

public static void main (String[] args)
 {

    int totMark;
    float per;

    Scanner scan=new Scanner(System.in);
     System.out.println("Enter ths  s1:");
     int s1=scan.nextInt();
     System.out.println("Enter ths  s2:");
     int s2=scan.nextInt();
     System.out.println("Enter ths  s3:");
     int s3=scan.nextInt();
     System.out.println("Enter ths  s4:");
     int s4=scan.nextInt();
     System.out.println("Enter ths  s5:");
     int s5=scan.nextInt();
     System.out.println("Enter ths  s6:");
     int s6=scan.nextInt();
     totMark=s1+s2+s3+s4+s5+s6;
     per=(float)totMark/6;

    System.out.println("total Marks="+totMark);
    System.out.println("Per="+per);
    StudentResult ob=new StudentResult();
    String Result=ob.Calculate(per);
    System.out.println(Result);
    
 }   
}
