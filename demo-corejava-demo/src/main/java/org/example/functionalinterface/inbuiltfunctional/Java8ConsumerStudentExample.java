package functionalinterface.inbuiltfunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Java8ConsumerStudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<StudentConsumer> studentList = createStudentList();
        // Creating Consumer for student object which will be used in forEach method of
        // list
        Consumer<StudentConsumer> consumerForStudent = s -> System.out.println(s.getName().toUpperCase());
        studentList.forEach(consumerForStudent);
    }
 
    public static List<StudentConsumer> createStudentList() {
        List<StudentConsumer> studentList = new ArrayList<>();
        StudentConsumer s1 = new StudentConsumer(1, "Arpit", "M", 19);
        StudentConsumer s2 = new StudentConsumer(2, "John", "M", 17);
        StudentConsumer s3 = new StudentConsumer(3, "Mary", "F", 14);
        StudentConsumer s4 = new StudentConsumer(4, "Martin", "M", 21);
        StudentConsumer s5 = new StudentConsumer(5, "Monica", "F", 16);
        StudentConsumer s6 = new StudentConsumer(6, "Ally", "F", 20);
 
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);
        return studentList;
    }
}