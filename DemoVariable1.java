class DemoVariable1{
    static int a=10;//memory in class
    int b=20;//memory in method_frame
    public static void main(String[] args) {
        DemoVariable1 ob=new DemoVariable1();
        int c=30;//memory in class
     System.out.println("value of a="+a);
        System.out.println("value of b="+ob.b);
        System.out.println("value of c="+c);
        
    }
}