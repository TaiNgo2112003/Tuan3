/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan3_2;

/**
 *
 * @author Admin
 */
public class product {
    protected String description;
    protected String productID;
    protected double price;

    public product() {
    }

    public product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "product{" + "description=" + description + ", productID=" + productID + ", price=" + price + '}';
    }
    
    
}
