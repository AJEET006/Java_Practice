package string;

//Java program for the above approach
class GFG{

    //Function to convert string to
    //integer without using functions
    public static void convert(String s)
    {

        // Initialize a variable
        int num = 0;
        int n = s.length();

        // Iterate till length of the string
        for(int i = 0; i < n; i++)

            // Subtract 48 from the current digit
            num = num * 10 + ((int)s.charAt(i) - 48); //10+2=12//120+3=123

        // Print the answer
        System.out.print(num);
    }

    //Driver code
    public static void main(String[] args)
    {
        // Given string of number
        String s = "123";

        // Function Call
        convert(s);
    }
}

//This code is contributed by divyeshrabadiya07
