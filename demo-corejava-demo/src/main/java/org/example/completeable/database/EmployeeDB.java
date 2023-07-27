package org.example.completeable.database;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.completeable.dto.Employees;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class EmployeeDB {
    public static List<Employees> fetchDB()  {
        ObjectMapper mapper=new ObjectMapper();
        List<Employees> employee= null;
        try {
            employee = mapper.readValue(new File("employees.json"),new TypeReference<List<Employees>>(){});
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
