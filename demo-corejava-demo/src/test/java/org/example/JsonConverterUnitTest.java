package org.example;

import org.example.customeannotation.JsonConverter;
import org.example.customeannotation.JsonSerializationException;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.example.customeannotation.*;


public class JsonConverterUnitTest {
    @Test
    public void givenObjectNotSerializedThenExceptionThrown() throws JsonSerializationException {
        Object object = new Object();
        JsonConverter serializer = new JsonConverter();
        assertThrows(JsonSerializationException.class, () -> {
            serializer.convertObjectIntoJson(object);
        });
    }

    @Test
    public void givenObjectSerializedThenTrueReturned() throws JsonSerializationException {
        Person person = new Person("soufiane", "cheouati", "34");
        JsonConverter serializer = new JsonConverter();
        String jsonString = serializer.convertObjectIntoJson(person);
        assertEquals("{\"personAge\":\"34\",\"firstName\":\"Soufiane\",\"lastName\":\"Cheouati\"}", jsonString);
    }
}
