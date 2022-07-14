import java.util.Scanner;

class Subject
{
public static void main(String[] args)
{
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter subject 1 :");
 int s1=sc.nextInt();   
int s2=92,s3=96,s4=88,s5=75,s6=90,totMark;
double per;
totMark=s1+s2+s3+s4+s5+s6;
per=(double)totMark/6;
System.out.println("s1="+s1);

System.out.println("s2="+s2);

System.out.println("s3="+s3);

System.out.println("s4="+s4);
System.out.println("s5="+s5);
System.out.println("s6="+s6);
System.out.println("totMarks="+totMark);

System.out.print("Percentage="+per);
sc.close();

}

}