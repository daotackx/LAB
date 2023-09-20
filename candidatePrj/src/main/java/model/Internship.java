/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author THAO LINH
 */
public class Internship extends Candidate {
    private String majors;
    private String semester;
    private String universityName;

    public Internship(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate, String majors, String semester, String universityName) {
        super(id, firstName, lastName, birthDate, address, phone, email, typeCandidate);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Internship() {
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Internship{" + super.toString() + "majors=" + majors + ", semester=" + semester + ", universityName=" + universityName + '}';
    }
    
    
}
