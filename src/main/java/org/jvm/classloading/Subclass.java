package org.jvm.classloading;

/**
 * @author : dchat
 * @since : 8/11/2020, Tue
 **/
class Subclass extends Superclass implements Superinterface {
    static final int STATIC_FINAL = 47; // compile time constant
    static final int STATIC_FINAL2 = (int) (Math.random() * 5); // runtime constant

    //static String stringLiteral = "hello";
    //public static int STATIC_FINAL4 = new ClassInitializationDemo().getInt();

    ObjectReference objectReference = new ObjectReference();
    static {
        System.out.println("Subclass: static initializer");
        //staticFinal = 47;
    }
    Subclass () {
        System.out.println("Subclass: constructor");
    }
    // Instance initializer is copied to the beginning of constructor by compiler
    {
        System.out.println("Subclass: instance initializer");
    }
}
