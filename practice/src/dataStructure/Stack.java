package dataStructure;
public class Stack{
	private  int top=-1;
	private  int [] arr;

	public Stack() {
		this.arr=new int [5];
	}

	public void push(int value)
	{
		if(this.top<=this.arr.length-1)
		{
			this.top++;
			this.arr[this.top] = value;
			System.out.println("inserted");
		}
		else
		{
			System.out.println("stack is overflow");

		}

	}

	public  void pop()
	{
		if(top==-1) 
		{
			System.out.println("Stack is underflow");
		}
		else {
			int value = arr[top];
			top--;
			System.out.println("Element popped");
		}
	}
	
	public String peak()
	{
		if(top==-1) System.out.println("Stack is empty");
		else
		{
			int value=arr[top];
			return "value is = "+ value;
		}
		return null;
		
		
	}


	public static void main(String [] args)
	{
		Stack s = new Stack();
		s.push(13);
		s.push(45);
		s.push(89);
		s.push(245);
		s.push(89);
		s.pop();
		s.push(189);
		String data = s.peak();


		System.out.println(	data);
	}

}
