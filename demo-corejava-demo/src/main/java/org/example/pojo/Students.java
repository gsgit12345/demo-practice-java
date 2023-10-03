package pojo;


import java.util.HashMap;

public class Students  {
    String name;
    int age;

   public   Students(String name, int age ){
        this.name = name;
        this.age=age;
    }

    @Override
    public int hashCode() {
        System.out.println("__hash__");
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        System.out.println("hashcode::"+result);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("__eq__");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Students other = (Students) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public static void main(String[] args) {

        Students S1 = new Students("taj",22);
        Students S2 = new Students("taj",21);

        System.out.println(S1.hashCode());
        System.out.println(S2.hashCode());

        HashMap<Students,String > HM = new HashMap<Students,String > (); 
        HM.put(S1, "tajinder");
        HM.put(S2, "tajinder");
        System.out.println(HM.size());
    }
}