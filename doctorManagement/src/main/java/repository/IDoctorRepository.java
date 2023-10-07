/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.HashMap;
import model.Doctor;

/**
 *
 * @author THAO LINH
 */
public interface IDoctorRepository {
    void addDoctor () throws Exception;
    void updateDoctor () throws Exception;
    void deleteDoctor () throws Exception;
    HashMap<String, Doctor> searchDoctor () throws Exception;
}
