class DemoMethods1
{
int a=10; //instance variable in heap
static int b=20;
void m1()
{
System.out.println("a="+a);
System.out.println("b="+b);


}
static void m2()
{
//System.out.println("a"+a);
System.out.println("b="+b);

}

public static void main (String[] args )
{
DemoMethods1 ob=new DemoMethods1();
DemoMethods1.m2();
ob.m1();
}
}