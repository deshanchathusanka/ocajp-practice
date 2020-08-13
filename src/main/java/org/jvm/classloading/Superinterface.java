package org.jvm.classloading;

/**
 * @author : dchat
 * @since : 8/11/2020, Tue
 **/
interface Superinterface {
    int STATIC_FINAL3 = new ClassInitializationDemo().getInt();
    int STATIC_FINAL5 = new ClassInitializationDemo().getInt5();

    static void staticMethod() {
        System.out.println("Superinterface: staticMethod");
    }
}
