
public class SingletonClass {
    public static SingletonClass s=null;
    private SingletonClass()
    {
        System.out.println("this is me only me");
    }
    public static SingletonClass getInstance()
    {
        if(s==null)
        {
            s=new SingletonClass();
            return s;
        }
        return s;
    }
    public static void main(String[] args) {
        SingletonClass.getInstance();
        SingletonClass.getInstance();
        SingletonClass.getInstance();

    }

}
