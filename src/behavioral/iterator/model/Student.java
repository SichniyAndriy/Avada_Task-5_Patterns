package behavioral.iterator.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

@Getter
public class Student {
    private final String fullName;
    private final List<Exam> exams;

    public Student(String fullName) {
        this.fullName = fullName;
        exams = new ArrayList<>();
    }

    public void addExam(Exam exam) {
        exams.add(exam);
    }
}
