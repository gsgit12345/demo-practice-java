package org.example.functionalinterface.inbuiltfunctional;

import java.util.List;
import java.util.function.BiPredicate;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//method2();
		
		//method3();
		method4();
	}
    public static void method1() {
        BiPredicate<String, Integer> filterByLength = (str1, length) -> str1.length() >= length;
 
        boolean isEqual = filterByLength.test("adam", 5);
        System.out.println(isEqual);
 
        boolean isEqual1 = filterByLength.test("geek", 4);
        System.out.println(isEqual1);
    }
    public static void method2() {
        List<BiPredicateStudent> students = BiPredicateStudent.create();
 
        BiPredicate<BiPredicateStudent, String> filterByDepartment =
                (student, department) -> student.getDepartment().equals(department);
 
        for (BiPredicateStudent student : students) {
            boolean result = filterByDepartment.test(student, "medical");
            if (result)
                System.out.println(student);
        }
    }
    
    public static void method3() {
        List<BiPredicateStudent> students = BiPredicateStudent.create();
 
        BiPredicate<BiPredicateStudent, String> namePrefixFilter = (student, prefix) -> student.getName().startsWith(prefix);
 
        BiPredicate<BiPredicateStudent, String> nameSuffixFilter = (student, suffix) -> student.getName().endsWith(suffix);
 
        for (BiPredicateStudent student : students) {
            boolean result = namePrefixFilter.and(nameSuffixFilter).test(student, "a");
            if (result)
                System.out.println(student);
        }
    }
    public static void method4() {
        BiPredicate<String, Integer> filterByLength = (string, length) -> string.length() >= length;
 
        // string length should not greater than or equal to 5
        System.out.println(filterByLength.negate().test("geeks", 5));

}
}