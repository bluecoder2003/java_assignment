package assignment_8.differentpackage;

import samepackage.ClassA;

public class ClassB extends ClassA{
    public void showValues() 
    {
        System.out.println("Public Var from ClassA: " + publicVar);
        System.out.println("Protected Var from ClassA: " + protectedVar);
    }
    public static void main(String[] args) {
        ClassB obj = new ClassB();
        obj.showValues();
    }
}
