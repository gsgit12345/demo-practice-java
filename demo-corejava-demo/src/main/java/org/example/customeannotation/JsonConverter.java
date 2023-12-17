package org.example.customeannotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonConverter {
    public String convertObjectIntoJson(Object object)throws  JsonSerializationException
    {
        String jsonContent=null;
        try
        {
        jsonContent=     getJsonObject(object);
        }catch (Exception ex)
        {
            throw new JsonSerializationException("can not serialize the object");
        }
        return  jsonContent;
    }
    public boolean isSerializableObject(Object object)
    {
        Class<?> classz=object.getClass();
        if(!Objects.isNull(object) || !classz.isAnnotationPresent(JsonSerializor.class))
            return false;
        return true;
    }
    public String getJsonObject(Object object) throws IllegalArgumentException, JsonSerializationException, IllegalAccessException {
       boolean isSeriliable= isSerializableObject(object);
        String jsonString="";
        if(!isSeriliable) {
            Class<?> currentObject = object.getClass();
            Map<String,String> objectToString=new HashMap<>();
            for(Field field:currentObject.getDeclaredFields())
            {
                field.setAccessible(true);
                if(field.isAnnotationPresent(JsonElement.class))
                {
                    objectToString.put(getKey(field),(String) field.get(object));
                }
            }
             jsonString=objectToString.entrySet().stream().map(element->"\""+element.getKey() +"\":\"" + element.getValue() + "\"")
                    .collect(Collectors.joining(","));
        }
        return "{"+ jsonString+"}";

    }
    public String getKey(Field field)
    {
        String key=field.getAnnotation(JsonElement.class).key();
        return key.isEmpty() ? field.getName() : key;
    }
}
