import java.util.*;
class Program
{
public static void main(String[] args)
{
int a,b,c,d=3;

while(d!=0)
{
Scanner e=new Scanner(System.in);
System.out.println("Enter number a=");
a=e.nextInt();

System.out.println("Enter number b=");
b=e.nextInt();
c=a+b;

System.out.println("Sum of a & b ="+c);
d--;
e.close();
}
}




}