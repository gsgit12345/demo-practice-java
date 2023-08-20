package org.example.subjectivec8.identityfunc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectSorting {
    public static void main(String str[])
    {
        List<User> userList = new ArrayList<>(Arrays.asList(
                new User("John", 33),
                new User("Robert", 26),
                new User("Mark", 26),
                new User("Brandon", 42)));
        sortByAge(userList);

    }
    public static void sortByAge(List<User> userList)
    {
      List<User> users =  userList.stream().sorted(Comparator.comparing(User::getAge).reversed()).collect(Collectors.toList());
      users.forEach(System.out::println);
    }
    public static void customeComparator(List<User> userList)
    {
        Comparator<User> customeComparator=new Comparator<User>()
        {
            @Override
            public int compare(User user, User user1) {
                if(user.getAge()==user1.getAge())
                    return user.getName().compareTo(user1.getName());
                else if (user.getAge()>user1.getAge())
                return 1    ;
                else return 1;
            }
        };

        userList.stream().sorted(customeComparator).collect(Collectors.toList());
    }
}
