/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author THAO LINH
 */
public class Dictionary {
    private String eng;
    private String viet;

    public Dictionary() {
    }

    public Dictionary(String eng, String viet) {
        this.eng = eng;
        this.viet = viet;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }

    public String getViet() {
        return viet;
    }

    public void setViet(String viet) {
        this.viet = viet;
    }

    @Override
    public String toString() {
        return "Dictionary{" + "eng=" + eng + ", viet=" + viet + '}';
    }
    
}
