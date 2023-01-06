package abstract1;

abstract class A1
{
    void aa()
    {
        System.out.println("-------------");

    }
    public void abc()
    {
        System.out.println("tttttttttttttttt");
    }
    private void ab()
    {

    }
    void abcd()

    {

    }
    abstract void avv();
}

class Ab extends A1{

    @Override
    void avv() {
        // TODO Auto-generated method stub

    }
    @Override
    public void abc() {
        System.out.println("ooooooooooooooo");

    }
    @Override
    public void aa() {
        System.out.println("dhfgjkdsr");
    }
}
public class Main
{
    public static void main(String[] args)
    {
       
        //A1 a= new Ab();
        Ab a= new Ab();
        a.aa();
        a.abc();
    }
}