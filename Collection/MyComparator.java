package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student o1, Student o2) {
            return o1.name.compareToIgnoreCase(o2.name);
    }


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "rupesh", 25));
        students.add(new Student(2, "Chandan", 28));
        students.add(new Student(3, "Mahendra", 26));

        Collections.sort(students, new MyComparator());

        for(Student s : students){
            System.out.println(s);
        }
    }
}
