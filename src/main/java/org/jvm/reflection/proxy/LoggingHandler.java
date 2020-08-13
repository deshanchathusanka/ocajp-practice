package org.jvm.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * This is used to intercept existing class methods
 *
 * @author : dchat
 * @since : 8/13/2020, Thu
 **/
public class LoggingHandler implements InvocationHandler
{
    // this is the existing object
    private final Object target;
    private Map<String,Integer> calls = new HashMap<>();

    public LoggingHandler( Object target )
    {
        this.target = target;
    }

    @Override
    public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable
    {
        String name = method.getName();

        // redirect toString method
        if( name.contains( "toString" ) )
        {
            return calls.toString();
        }

        // update number of method calls
        calls.merge( name, 1, Integer::sum );

        // invoke real method
        return method.invoke( target, args );
    }
}
