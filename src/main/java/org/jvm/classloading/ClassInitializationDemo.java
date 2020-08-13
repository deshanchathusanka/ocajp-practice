package org.jvm.classloading;

/**
 * @author : dchat
 * @since : 8/11/2020, Tue
 **/
public class ClassInitializationDemo
{
    {
        System.out.println("\nClassInitializationDemo: instance initializer");
    }
    static {
        System.out.println("\nClassInitializationDemo: static initializer (Initialization Stage)");
    }
    int getInt() {
        System.out.println("ClassInitializationDemo:getInt()");
        return 3;
    }
    int getInt5() {
        System.out.println("ClassInitializationDemo:getInt5()");
        return 5;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(ClassInitializationDemo.class.getClassLoader());
        System.out.println("\nJVM invoked the main method ... ");
        System.out.println("Subclass.STATIC_FINAL: " + Subclass.STATIC_FINAL);
        //System.out.println("Subclass.stringLiteral: " + Subclass.stringLiteral);
        System.out.println("Invoking Subclass.STATIC_FINAL2  ... ");
        System.out.println("Subclass.STATIC_FINAL2: " + Subclass.STATIC_FINAL2);
        System.out.println("\nInstantiating Subclass ...");
        new Subclass();
        System.out.println("Superinterface.STATIC_FINAL3: " + Superinterface.STATIC_FINAL3);
        //Superinterface.staticMethod();
    }
}

