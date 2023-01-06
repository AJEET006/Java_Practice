/*Algorithm: 

1.Create two array prefix and suffix of length n, i.e length of the original array,
 	initialize prefix[0] = 1 and suffix[n-1] = 1 and also another array to store the product.
2.Traverse the array from second index to end.
3.For every index i update prefix[i] as prefix[i] = prefix[i-1] * array[i-1], 
	i.e store the product upto i-1 index from the start of array.
4.Traverse the array from second last index to start.
5.For every index i update suffix[i] as suffix[i] = suffix[i+1] * array[i+1], 
	i.e store the product upto i+1 index from the end of array
6.Traverse the array from start to end.
7.For every index i the output will be prefix[i] * suffix[i], 
	the product of the array element except that element.
 */
package dataStructure;

public class ProductOfArrayExceptSelf {

	public static void product(int [] num)
	{
		//length of original array
		int l = num.length; 
		//array to store the left element of current element of original array
		int [] left= new int [l];
		left[0]=1;
		//array to store the right element of current element of original array
		int [] right= new int [l];
		right[l-1]=1;
		//Array to store the product
		int [] productArray = new int [l];
		int i,j;
		 for (i = 1; i < l; i++)
	            left[i] = num[i - 1] * left[i - 1];
	 
	        /* Construct the right array */
	        for (j = l - 2; j >= 0; j--)
	            right[j] = num[j + 1] * right[j + 1];
	 
	        /* Construct the product array using
	        left[] and right[] */
	        for (i = 0; i < l; i++)
	        	productArray[i] = left[i] * right[i];
	 
	        /* print the constructed prod array */
	        for (i = 0; i < l; i++)
	            System.out.print(productArray[i] + " ");
		return ;
	}
	public static void main(String[] args) {
		int [] nums = {2,6,1,3,4};
		product(nums);		
	}

}

