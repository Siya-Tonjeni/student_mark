package za.ac.mycput.studentmarks.service.student;

import za.ac.mycput.studentmarks.entity.student.Student;
import za.ac.mycput.studentmarks.service.IService;

import java.util.Set;

public interface StudentService extends IService<Student, Integer> {
    Set<Student> getAll();
}
