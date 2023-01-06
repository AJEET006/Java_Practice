package overriding;

abstract class School {
	abstract void student();
}
class Electrical extends School{
	@Override
	public void student()
	{

		System.out.print("from Electrical\n");

	}
}

class Mechanical extends School{
	public void student()
	{
		System.out.print("from Mechanical\n");
	}
}
class Civil extends School{
	public void student()
	{
		System.out.print("from Civil");
	}
}



