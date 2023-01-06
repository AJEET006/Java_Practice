package Enzigma;
class FindElement{
 public static void main(String[] args) {
    Integer [] arr ={12,45,78,65,24,33,55,55,45,65,97,59,99,12,11,47};
  for(int i=0;i<arr.length;i++)
  {
      for(int j=i+1;j<arr.length;j++)
      {
          if(arr[i]>arr[j])
          {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
          }
      }
  }
  for(Integer i : arr)
  {
      System.out.print(i+" ");
  }
   System.out.println();
  System.out.println(arr[1]+" "+arr[arr.length-2]);
 }
}

