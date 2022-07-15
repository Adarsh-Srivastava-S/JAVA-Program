import java.util.Scanner;

class Addition
{
    int add(int x, int y)
    {
        return x+y;
    }
}

class Substraction
{
    int sub(int x, int y)
    {
        return x-y;
    }
}

class Multiplication
{
    int mul(int x, int y)
    {
        return x*y;
    }
}

class Division
{
    float div(int x, int y)
    {
        return (float)x/y;
    }
}

class ModDivision
{
    int mod(int x, int y)
    {
        return x%y;
    }
}



public class DemoMethods8 {
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       System.out.print("Enter the value1 = ");
       int x=s.nextInt();
       System.out.print("Enter the value2 = ");
       int y=s.nextInt();
       System.out.println("=======Choice=============");
       System.out.println("1.ADD\n2.SUB\n3.MUL\n4.DIV\n5.MOD");
       System.out.println("Enter your Choice :-");
       int q=s.nextInt();
       switch(q)
       {
        case 1:
                Addition oba=new Addition();
                int a=oba.add(x,y);
                System.out.println("ADD="+a); 
                break;
        
        case 2:
                Substraction ods=new Substraction();
                int su=ods.sub(x,y);
                System.out.println("SUB="+su); 
                break;
        
        case 3:
                Multiplication obm=new Multiplication();
                int m=obm.mul(x,y);
                System.out.println("MUL="+m); 
                break;
       
        case 4:
                Division obd=new Division();
                float d=obd.div(x,y);
                System.out.println("DIV="+d); 
                break;

        case 5:
                ModDivision obmo=new ModDivision();
                int mo=obmo.mod(x,y);
                System.out.println("MOD="+mo); 
                break;
        }

    }
}
