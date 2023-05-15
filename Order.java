/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan3_2;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Order extends  OrderDetail{
   private int OrderID;
   private LocalDate orderDate;
   private  int count;


    public Order() {
    }

    public Order(int OrderID, LocalDate orderDate, int count, int quantity, String description, String productID, double price) {
        super(quantity, description, productID, price);
        this.OrderID = OrderID;
        this.orderDate = orderDate;
        this.count = count;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
   
   

    @Override
    public String toString() {
        return "Order{" + "OrderID=" + OrderID + ", orderDate=" + orderDate + ", count=" + count + ", lineItemDetail=" +  '}';
    }
  
    
}
