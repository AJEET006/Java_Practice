
public class Test {
	
	int k=40;
	static int j=90;
	
	public static void f1()
	{
	    int i=5;
		String str="Ajeet";
		System.out.println("int="+i+"String="+str);
		//System.out.println(k+","+j);//k is not accessible in static scope
	}
	public void f2()
	{
		int j=9;
		String str1="Sandeep";
		System.out.println("int="+j+"String="+str1);
		System.out.println(k+","+j); //static and non-static data are accessible
		
	}

}
class Test1
{
	public static void main(String [] arg)
	{
		Test.f1();//static method called with class name//it is early binding/compile time binding
		Test test = new Test();//for non static method create an instance of that class then call it//dynamic binding
		test.f2();
		test.f1();
//		Test test1;
//		for(int i=1;i<100000000;i++)
//		{
//			test1=new Test();
//			System.out.println("Object is created"+i+"times");
//		}
		
	}
}
