class DemoMethods2
{
int add(int a, int b)
{
int c=a+b;
return c;
}
float avg(int a, int b)
{
float c=(float)(a+b)/2;
return c;
}

public static void main(String[] args)
{
int q,a=34,b=78;
float w;
DemoMethods2 ob= new DemoMethods2();

q=ob.add(a,b);
w=ob.avg(a,b);
System.out.println("Sum="+q);
System.out.println("Average="+w);



}
}