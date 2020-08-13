package org.jvm.reflection;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : dchat
 * @since : 8/13/2020, Thu
 **/
public class ReflectionDemo
{
    public static void main( String[] args )
    {
        // method 1 : using getClass()
        Map<String,String> map = new HashMap<>();
        System.out.println( map.getClass() ); // class java.util.HashMap

        // method 2 : using forName static method
        try
        {
            Class<?> clazz = Class.forName( "java.lang.String" ); // load String class
            System.out.println( clazz ); // class java.lang.String

            Class<?> clazzArray = Class.forName( "[[Ljava.lang.String;" ); // load 2D String array class
            System.out.println( clazzArray );
        }
        catch( ClassNotFoundException e )
        {
            e.printStackTrace();
        }

        // method 3 : using .class append
        Class<?> intPrimitiveClazz = int.class;
        Class<Integer> intBoxClazz = Integer.class;
        System.out.println( intPrimitiveClazz ); // int
        System.out.println( intBoxClazz ); // class java.lang.Integer

        // method 4 : boxed primitives
        Class<?> booleanClazz = Integer.TYPE;
        System.out.println( booleanClazz ); // boolean


    }
}
