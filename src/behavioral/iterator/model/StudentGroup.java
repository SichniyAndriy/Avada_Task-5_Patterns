package behavioral.iterator.model;

import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StudentGroup {
    private final SortedSet<Student> students = new TreeSet<>(Comparator.comparing(Student::getFullName));

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.add(student);
    }

    public GroupIterator groupIterator() {
        return new MyGroupIterator(students.stream().toList());
    }

    public class MyGroupIterator implements GroupIterator {
        private final List<Student> group;
        private int index = 0;

        private MyGroupIterator(List<Student> students) {
            group = students;
        }

        @Override
        public boolean hasNext() {
            return index < group.size();
        }

        @Override
        public Student next() {
            return group.get(index++);
        }
    }
}
