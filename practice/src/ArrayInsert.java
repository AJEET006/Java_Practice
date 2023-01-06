import java.util.Scanner;

public class ArrayInsert {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,5,4,6,2,3,4};
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        System.out.println("Enter the position:");
        int pos = sc.nextInt();
        int[] temp = new int[arr.length+1];
        for(int i=0;i<arr.length;i++)
        {
            if(i!=pos-1)//0!=3//1!=3//2!=3//3!=3
                temp[i]=arr[i];//1//5//4//
            else
            {
                temp[i]=num;//9
                temp[i+1]=arr[i];//6
            }
        }

        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}