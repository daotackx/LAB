/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import dataAccess.StudentDao;
import java.util.List;
import model.Student;

/**
 *
 * @author THAO LINH
 */
public class StudentRepository implements IStudentRepository{

    @Override
    public List<Student> sortStudent() {
        return StudentDao.Instance().sortStudent();
    }

    @Override
    public void display() {
        StudentDao.Instance().display();
    }
    
}
