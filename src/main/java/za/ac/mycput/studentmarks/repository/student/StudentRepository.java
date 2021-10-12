package za.ac.mycput.studentmarks.repository.student;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.mycput.studentmarks.entity.student.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}