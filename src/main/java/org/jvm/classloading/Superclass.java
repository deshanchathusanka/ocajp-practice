package org.jvm.classloading;

/**
 * @author : dchat
 * @since : 8/11/2020, Tue
 **/
class Superclass {
    static {
        System.out.println("Superclass: static initializer");
    }
    {
        System.out.println("Superclass: instance initializer");
    }
    Superclass () {
        System.out.println("Superclass: constructor");
    }
}
