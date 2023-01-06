package dataStructure;

import java.util.Arrays;

public class PairOfSum
{
    public static void pairedElements(int arr[], int sum)
    {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            if (arr[low] + arr[high] == sum)
            {
                System.out.println("The pair is : ("
                        + arr[low] + ", " + arr[high] + ")");
            }
            if (arr[low] + arr[high] > sum) {
                high--;
            }
            else {
                low++;
            }
        }
    }

    
        public static void main(String [] args)
        {
            int [] arr = {5,6,7,4,9,10,3,8};
           Arrays.sort(arr); //{3,4,5,6,7,8,9,10}
            int sum=15 ;
            pairedElements(arr,sum);

        }

    }
