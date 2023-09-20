/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author THAO LINH
 */
public class Experience extends Candidate {
    private int expInYear;
    private String proSkill;

    public Experience(int id, String firstName, String lastName, int birthDate, String address, String phone, String email, int typeCandidate, int expInYear, String proSkill) {
        super(id, firstName, lastName, birthDate, address, phone, email, typeCandidate);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String toString() {
        return "Experience{" + super.toString() + "expInYear=" + expInYear + ", proSkill=" + proSkill + '}';
    }
    
    
}
