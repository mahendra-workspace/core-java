package Collection;

import java.util.ArrayList;
import java.util.List;

class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", 25));
        students.add(new Student(1, "Bob", 29));
        students.add(new Student(2, "Charlie", 21));

        // Sort by ID lambda function
        students.sort((s1, s2) -> Integer.compare(s1.id, s2.id));
        System.out.println("Sorted by ID: " + students);

        // Sort by Name lambda function
        students.sort((s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("Sorted by Name: " + students);
    }
}