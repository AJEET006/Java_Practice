package abstract1;

abstract class B{
    int a;
    public B(int num)
    {
        this.a=num;
    }
    abstract void fun();
}

public class A extends B{
    public A(int n)
    {
        super(n);
    }
    @Override
    public void fun()
    {
        System.out.println(this.a);
    }
    public static void main(String[] args) {
       B b= new A(2);
       b.fun();

    }

}
