package advanceJavaPractice;

public class Anonymous {

    public static void main(String[] args) {
        I1 i = new I1() {
            
            @Override
            public void print()
            {
                  System.out.println("type of class = "+getClass().getTypeName());        
            }           
        };
        i.print();
    }
}
interface I1{
    void print();    
}