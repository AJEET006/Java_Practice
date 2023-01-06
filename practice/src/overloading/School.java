package overloading;
//static polymorphism
//compile time polymorphism
//early binding
public class School{
	public void lab() {
		//chemistry lab
	}
	public void lab(String name)
	{
		//Physics lab
	}
	public int lab(int x, int y)
	{
		//mathematics lab
		int result=0;
		return result;
	}
}