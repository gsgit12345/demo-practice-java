package functionalinterface.inbuiltfunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BiPredicateStudent {
	private static final int BOUND = 100;
    private static final Random RANDOM = new Random();
 
    private final int id;
    private final String name;
    private final String department;
 
    private BiPredicateStudent(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
 
    public static List<BiPredicateStudent> create() {
        List<BiPredicateStudent> students = new ArrayList<>();
        students.add(new BiPredicateStudent(RANDOM.nextInt(BOUND), "adam", "medical"));
        students.add(new BiPredicateStudent(RANDOM.nextInt(BOUND), "eve", "commerce"));
        students.add(new BiPredicateStudent(RANDOM.nextInt(BOUND), "john", "non-medical"));
        students.add(new BiPredicateStudent(RANDOM.nextInt(BOUND), "asha", "medical"));
 
        return students;
    }
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public String getDepartment() {
        return department;
    }
 
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

