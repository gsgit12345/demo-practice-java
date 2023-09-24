package org.example.memoryleak;
public class Person2 {
    public String name;

    public Person2(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Person2)) {
            return false;
        }
        Person2 person = (Person2) o;
        return person.name.equals(name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        return result;
    }
    //this object will not create memory leak as it overrides equals and hashcode properly
}
