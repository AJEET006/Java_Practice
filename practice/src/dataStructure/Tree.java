package dataStructure;

public class Tree {
    static  TreeNode root;
    public Tree() {
        root=null;
    }

    public static void Insert(int data)
    {
        TreeNode it = root;
        TreeNode temp = new TreeNode(data);
        if(root==null)
        {
            root = temp;
        }

        else
        {
            while(true)
            {
                if(data < it.data)
                {
                    if(it.left == null)
                    {
                        it.left = temp;
                        break;
                    }
                    else
                    {
                        it=it.left;
                    }
                }
                else if(data > it.data)
                {
                    if(it.right == null)
                    {
                        it.right = temp;
                        break;
                    }
                    else
                    {
                        it=it.right;
                    }
                }
                else
                    break;
            }
        }
    }
    
      
    private static void printPreOrder(TreeNode it) 
    {
       
        if(it != null)
        {
            System.out.print(it.data + ", ");
           
            printPreOrder(it.left);
            printPreOrder(it.right);
         
        }

    }
    public static void main(String[] args) 
    {
        int [] arr = new int [] {45,20,30,89,56,1,8,75};
        for(int i=0;i<arr.length-1;i++)
        {
            Insert(arr[i]);
        }
        printPreOrder(root);

    }

}

class TreeNode{
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data, TreeNode left,TreeNode right)
    {
        this.data=data;
        this.left=left;
        this.right=right;
    }
    public TreeNode(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}