package org.jvm.reflection.proxy;

import java.lang.reflect.Proxy;

/**
 * @author : dchat
 * @since : 8/13/2020, Thu
 **/
public class DynamicProxyDemo
{
    @SuppressWarnings( "unchecked" )
    public static <T> T withLogging( T target, Class<T> ifs )
    {
        return ( T ) Proxy.newProxyInstance(
                ifs.getClassLoader(),
                new Class<?>[] { ifs }, // list of interfaces that proxy class is implemented
                new LoggingHandler( target ) // invocation handler
        );
    }

    public static void main( String[] args )
    {
        Human human = withLogging( new Person(), Human.class );
        human.talk();
        human.walk();
        human.talk();
        System.out.println( human );
    }
}
