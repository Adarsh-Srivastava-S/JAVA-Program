import java.util.Scanner;

//import javax.security.sasl.SaslException;
class EmpSal
{
    float Calculate(int bSal)
    {
        float totSal;
        totSal=(bSal+(0.93f*bSal)+(0.61f*bSal)); 
        return totSal;   
    }
    
}
class DemoMethods5
{
    public static void main(String[] args) {
        EmpSal s=new EmpSal();
        Scanner ob=new Scanner(System.in);
        int bSal=ob.nextInt();
        float totSal=s.Calculate(bSal);
        System.out.println("bSal="+bSal) ;
        System.out.println("totSal="+totSal);
    }
}