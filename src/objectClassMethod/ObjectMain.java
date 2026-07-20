package objectClassMethod;

import java.util.Objects;

public class ObjectMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("Abhi", 21, 74.58);

        Student s2 = (Student) s1.clone();

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("HashCode of s1: " + s1.hashCode());
        System.out.println("HashCode of s2: " + s2.hashCode());

        System.out.println("Same object? " + (s1 == s2));
        System.out.println("Equal objects? " + s1.equals(s2));
    }
}


class Student implements Cloneable {

    String name;
    int age;
    double percentage;


    public Student(String name, int age, double percentage) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;

        return age == other.age &&
                Objects.equals(name, other.name) &&
                Double.doubleToLongBits(percentage) ==
                Double.doubleToLongBits(other.percentage);
    }


    @Override
    public String toString() {
        return "Student [name=" + name +
                ", age=" + age +
                ", percentage=" + percentage + "]";
    }
}