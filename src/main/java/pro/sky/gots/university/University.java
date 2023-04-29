package pro.sky.gots.university;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class University {
    private Map <Integer, Student> allStudents;
    private int countId;

    public void addStudent(Student student) {
        if(allStudents == null) {
            allStudents = new HashMap<>();
        }
    }

    List<Student> getAllStudents() {
        return new ArrayList<Student>(allStudents.values());
    }

    public List<Student> getAllStudents(boolean isMale) {
        return allStudents.values().stream()
                .filter(value->value.isMale()==isMale)
                .collect(Collectors.toList());
    }
}
