/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author THAO LINH
 */
public class Fruit {
    private int fruitId;
    private String fruitName;
    private double price;
    private int quanlity;
    private String origin;

    public Fruit(int fruitId, String fruitName, double price, int quanlity, String origin) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.price = price;
        this.quanlity = quanlity;
        this.origin = origin;
    }

    public Fruit() {
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String orgin) {
        this.origin = orgin;
    }

    @Override
    public String toString() {
        return "Fruit{" + "fruitId=" + fruitId + ", fruitName=" + fruitName + ", price=" + price + ", quanlity=" + quanlity + ", origin=" + origin + '}';
    }
    
}
