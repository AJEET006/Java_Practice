import java.util.Iterator;

class HelloWorld {
    public static void main(String[] args) {
//       int [] nums ={2,2,1,1,1,2,2,1,2,1};
        int [] nums = {0,0,1,1,1,2,2,3,3,4};
       int res = test(nums);
       System.out.println(res);
//       int x=1;
//       while((x<60) && (x>0))
//       {
//           x++;
//       }
//       System.out.println(x);
        
//        int  i = 30;
//        if(i%3==0)
//        {
//            System.out.print("Raja ");
//        }else if(i%5==0)
//        {
//            System.out.print("Software");
//        }
//        if(i%3==0 && i%5==0)
//        {
//            System.out.print("Raja Software");
//        }else
//        {
//            System.out.print("Exit");
//        }
      
    }
//    public static int test(int [] nums)
//    {
//        int sum=nums.length/2;
//        for(int num : nums)
//        {
//            int cnt=0;
//            for(int ele : nums)
//            {
//                if(ele==num)
//                {
//                    cnt += 1;
//                }
//            }
//            if(cnt>sum)
//                return num;
//        } 
//        return -1;
//    }
    
    public static int test(int [] nums)
    {
        if(nums.length == 0) return 0;
        int i=0;
        for (int j =1;j<nums.length; j++) {
            if(nums[j] != nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}