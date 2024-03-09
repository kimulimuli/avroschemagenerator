package com.kimulimuli;

import org.apache.avro.Schema;
import org.junit.Assert;
import org.junit.Test;

public class AvroSchemaGeneratorTest {

    @Test
    public void testGenerateSchema() {
        String expectedSchema = "{\"type\":\"record\",\"name\":\"Person\",\"namespace\":\"com.kimulimuli\",\"fields\":[{\"name\":\"age\",\"type\":\"int\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"surname\",\"type\":\"string\"}]}";
        Schema schema = AvroSchemaGenerator.generateSchema(Person.class);

        Assert.assertNotNull(schema);
        Assert.assertEquals("Person", schema.getName());
        Assert.assertEquals(expectedSchema, schema.toString());
    }
}
