package com.example.StudentCRUD.service;

import com.example.StudentCRUD.StudentCrudApplication;
import com.example.StudentCRUD.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(
            Arrays.asList(
                    new Student(1,"Abin","IT"),
                    new Student(2,"Binu","IT")
            )
    );
    public List<Student> getStudents() {
        return students;
    }

    public Student getStdByRno(int rollno) {
        int index =0;
        boolean found=false;
        for (int i=0;i<students.size();i++) {
            if (students.get(i).getRno()==rollno) {
                index = i;
                found = true;
            }
        }
        if (found)
            return students.get(index);
        else
            return null;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String updateStudent(Student student) {
        int index=0;
        boolean found=false;
        for (int i=0;i<students.size();i++){
            if (students.get(i).getRno()==student.getRno()) {
                index = i;
                found = true;
                break;
             }
        }
        if (found) {
            students.set(index,student);
            return "Updation is completed";
        } else
            return "No such student exist";

    }

    public String deleteStudent(int rno) {
        int index=0;
        boolean found = false;
        for (int i=0;i< students.size();i++) {
            if (students.get(i).getRno()==rno) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            students.remove(index);
            return "Deleted successfully";
        }
        else
            return "No such student record found";

    }
}
