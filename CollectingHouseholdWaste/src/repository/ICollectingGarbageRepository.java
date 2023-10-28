/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import model.GarbageTruck;

/**
 *
 * @author THAO LINH
 */
public interface ICollectingGarbageRepository {
    void getInput(GarbageTruck g);
    void printTheCost(GarbageTruck g);
}
