package org.example.customeannotation;

import java.io.Serial;

public class JsonSerializationException  extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;

    public JsonSerializationException(String message)
    {
        super(message);
    }

}
