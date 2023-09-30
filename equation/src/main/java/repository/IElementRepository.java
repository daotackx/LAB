/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.util.List;

/**
 *
 * @author THAO LINH
 */
public interface IElementRepository {
    List<Float> calculateEquation(float a, float b);
    List<Float> calculateQuadraticEquation(float a, float b, float c);
}
