package za.ac.mycput.studentmarks.controller.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import za.ac.mycput.studentmarks.entity.student.Student;
import za.ac.mycput.studentmarks.factory.student.StudentFactory;
import za.ac.mycput.studentmarks.service.student.impl.StudentServiceImpl;

import java.util.Set;
@RestController
public class StudentController {
    private StudentServiceImpl studentService;

    @GetMapping("/list")
    public Set<Student> list(){
        return studentService.getAll();
    }

    @PostMapping("/create")
    public Student create(@RequestBody Student student){
        Student newStudent = StudentFactory.createStudent(student.getStudentId(), student.getStudentName(), student.getStudentPhoneNumber(), student.getStudentEmail(), student.getStudentPassword(), student.getStudentAddress());
        return  studentService.create(newStudent);
    }

}
