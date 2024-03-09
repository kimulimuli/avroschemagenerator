package com.kimulimuli;

import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;

public class AvroSchemaGenerator {

    public static <T> Schema generateSchema(Class<T> pojoClass) {
        return ReflectData.get().getSchema(pojoClass);
    }
}

