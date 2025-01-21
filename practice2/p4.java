package practice2;

// a) Demonstrating member inner class
class Outer
{
    String message="hello";
    public class Inner
    {
        void display()
        {
            System.out.println(message);
        }
    }
}

// b) Demonstrating static nested class with instance and static methods
class NestedClass
{
    static class egclass
    {
        void instanceMethod() {
            System.out.println("Instance method in static nested class.");
        }

        static void staticMethod() {
            System.out.println("Static method in static nested class.");
        }
    }
}

// c) Demonstrating Exception chaining
class ExceptionChaining {
    void methodA() throws Exception {
        throw new Exception("Exception from methodA");
    }
    void methodB() throws Exception {
        try{
            methodA();
        }
        catch (Exception e) {
            throw new Exception("Exception in methodB caused by methodA", e);
        }
    }
}

public class p4 {
    public static void main(String[] args) {
        Outer obj=new Outer();
        Outer.Inner ob=obj.new Inner();
        ob.display();

        NestedClass.egclass a=new NestedClass.egclass();
        a.instanceMethod();
        NestedClass.egclass.staticMethod();

        ExceptionChaining chainingDemo = new ExceptionChaining();
        try {
            chainingDemo.methodB();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

    }
}
