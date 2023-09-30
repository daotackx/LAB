/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;


import dataAccess.ElementDao;
import java.util.ArrayList;

import java.util.List;
import model.Element;

/**
 *
 * @author THAO LINH
 */
public class ElementRepository implements IElementRepository{
    
//    private List<Element> number;
    public ElementRepository() {
//        number = new ArrayList<>();
    }

    @Override
    public List<Float> calculateEquation(float a, float b) {
        return ElementDao.Instance().calculateEquation(a,b);
    }

    @Override
    public List<Float> calculateQuadraticEquation(float a, float b, float c) {
        return ElementDao.Instance().calculateQuadraticEquation(a,b,c);
    }

}
