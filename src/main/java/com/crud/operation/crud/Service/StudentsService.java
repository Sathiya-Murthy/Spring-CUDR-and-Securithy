package com.crud.operation.crud.Service;

import com.crud.operation.crud.Models.Students;

import java.util.List;

public interface StudentsService {
    Students saveStudents(Students students);
    List<Students> getAllStudents();
    Students getStudentsByRollNo(int RollNo);
    Students updateStudent(Students students,int RollNo);
    void deleteStudent(int RollNo);
}
