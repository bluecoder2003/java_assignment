package practice2;

public class p2 {
    public static void main(String [] args)
    {
        p2 ob=new p2();
        try{
            ob.methodA();
        }
        catch(ArithmeticException e)
        {
            System.out.println("arithmetic exception");
        }
    }
        void methodA()
        {
            methodB();
        }
        void methodB()
        {
            methodC();
        }
        void methodC()
        {
            int result = 10/0;
        }
}
