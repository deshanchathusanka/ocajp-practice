package org.jvm.reflection.proxy;

/**
 * @author : dchat
 * @since : 8/13/2020, Thu
 **/
public class Person implements Human
{
    @Override
    public void walk()
    {
        System.out.println( "person can walk" );
    }

    @Override
    public void talk()
    {
        System.out.println( "person can talk" );
    }
}
