package overriding;


public class C {

    public static void main(String[] args) {
       
    }

}
class A{
    public void fun()
    {
        System.out.println();;
    }
}
class B extends A{
    @Override
    public void fun()
    {
        System.out.println();;
    }
}
