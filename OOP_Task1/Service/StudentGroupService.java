package OOP_Task1.Service;

import OOP_Task1.Entity.Student;
import OOP_Task1.Entity.StudentGroup;

import java.util.Collections;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student){
        studentGroup.students.add(student);
    }

    public List<Student> sort(){
        Collections.sort(studentGroup.students);
        return studentGroup.students;
    }

}
