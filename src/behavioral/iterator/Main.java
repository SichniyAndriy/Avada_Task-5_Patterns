package behavioral.iterator;

import behavioral.iterator.model.Exam;
import behavioral.iterator.model.GroupIterator;
import behavioral.iterator.model.Student;
import behavioral.iterator.model.StudentGroup;
import java.time.LocalDateTime;
import java.util.Locale;
import net.datafaker.Faker;

/*
* Pattern Interpreter lets walkthrough collection without
* exposing underlying representation
*/
public class Main {
    public final static Faker faker = new Faker(Locale.getDefault());

    public static void main(String[] args) {
        StudentGroup group = new StudentGroup();
        formGroup(group);

        GroupIterator groupIterator;
        groupIterator = group.groupIterator();
        while(groupIterator.hasNext()) {
            Exam exam = new Exam(faker.science().unit(), LocalDateTime.now().plusDays(10));
            groupIterator.next().addExam(exam);
        }

        groupIterator = group.groupIterator();
        Exam exam = new Exam("Math", LocalDateTime.now().plusMonths(2));
        while(groupIterator.hasNext()) {
            groupIterator.next().addExam(exam);
        }
    }

    static void formGroup(StudentGroup group) {
        int len = faker.random().nextInt(10, 20);
        for (int i = 0; i < len; i++) {
            String firstName = faker.name().firstName();
            String lastName = faker.name().lastName();
            group.addStudent(new Student(firstName + " " + lastName));
        }
    }
}
