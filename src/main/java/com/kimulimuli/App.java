package com.kimulimuli;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(AvroSchemaGenerator.generateSchema(Person.class));
    }
}
