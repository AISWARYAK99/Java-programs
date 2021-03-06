class A
{
    public int a;
}
class B extends A
{
    public int b;
    public void print()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
public class InhClass
{
    public static void main(String[] args)
    {
        B b1=new B();
        b1.a=10;
        b1.b=20;
        b1.print();
    }
}