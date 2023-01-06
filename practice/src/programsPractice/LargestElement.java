package programsPractice;

public class LargestElement {
    
    public static void main(String [] args) 
    {
        int [] array = {45,1,56,8,79,888,4,5,2300,67,99,12};
        int larg=largest(array);
        System.out.println(larg);
    }
    public static int largest(int[] num)
    {
        int temp=num[0];
        for(int i=0;i<num.length;i++)
        {
            if(temp<num[i])
            {
                temp=num[i];
            }
        }
        return temp;
    }
}
