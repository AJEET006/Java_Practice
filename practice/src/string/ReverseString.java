package string;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Ajeet",str1="";
        char ch;
        int n = str.length();
        for(int i=n-1; i>=0; i--)
        {
            ch=str.charAt(i);
            str1=str1+ch;
        }
        System.out.print(str1);
    }

}
